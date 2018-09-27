<template>
  <section>
    	<el-col :span="24" class="toolbar"  style="padding-bottom: 20px;">
      </el-col>
    <!--列表-->
		  <el-table :data="orderDetails"  :summary-method="getSummaries" show-summary style="width: 100%;">
        <el-table-column > </el-table-column>
  			<el-table-column prop="orderId" label="订单号" min-width="130" >
  			</el-table-column>
  			<el-table-column prop="menuName" label="菜品名称" min-width="130" sortable>
  			</el-table-column>
        <el-table-column prop="menuAmount" label="菜品数量" min-width="130" sortable>
  			</el-table-column>
  			<el-table-column prop="menuPrice" label="菜品单价" min-width="130" sortable>
  			</el-table-column>
        <el-table-column prop="menuTotal" label="菜品总价" min-width="130" sortable>
			</el-table-column>
		</el-table>
  </section>
</template>

<script>
  export default{
      data(){
        return{
          orderDetails:[]
        }
      },
      methods: {
        // 计算订单总价
        getSummaries(param) {
        const { columns, data } = param;
        const sums = [];
        columns.forEach((column, index) => {
          if (index === 0) {
            sums[index] = '订单总价';
            return;
          }
          if(column.property=='menuTotal'){//选择列
            const values = data.map(item => Number(item[column.property]));//获取列值
            if (!values.every(value => isNaN(value))) {
              sums[index] = values.reduce((prev, curr) => {
                const value = Number(curr);
                if (!isNaN(value)) {
                  return prev + curr;
                } else {
                  return prev;
                }
              }, 0);
              sums[index] += ' 元';
              return;
            }
          }
          else {
            sums[index] = '';
            return;
          }
        });
        return sums;
      }
    },
      created:function(){
        let rou =this.$route.matched;
        console.log(rou);
        let data=this.$route.query.data;
          this.$api.orderDetail(data).then(response=>{
          this.orderDetails=response.data;
        });
    }
  }
</script>

<style>

</style>
