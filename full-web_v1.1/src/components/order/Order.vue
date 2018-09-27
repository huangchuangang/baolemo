<template>
  <section>
    <!--工具条-->
		<el-col :span="24" class="toolbar" style="padding-bottom: 0px;">
			<el-form :inline="true" ><!--输入框长度-->
				<el-form-item>
					<el-input  placeholder="订单号"></el-input>
				</el-form-item>
				<el-form-item>
					<el-button type="primary" >查询</el-button>
				</el-form-item>
        <!-- <el-form-item>
					<el-button type="primary" @click="handleAdd">新增</el-button>
				</el-form-item> -->

			</el-form>
		</el-col>

    <!--列表-->
		<el-table :data="orders" style="width: 100%;">
			<el-table-column type="selection" min-width="55">
			</el-table-column>
			<el-table-column prop="index" min-width="60">
			</el-table-column>
			<el-table-column prop="orderId" label="订单号" min-width="130" sortable style:>
			</el-table-column>
			<el-table-column prop="tableId" label="餐桌号" min-width="130" sortable>
			</el-table-column>
			<el-table-column prop="oderPrice" label="订单金额" min-width="130" sortable>
			</el-table-column>
			<el-table-column prop="payStatus" label="支付状态" min-width="160" :formatter="formatPaySta" sortable>
			</el-table-column  :style="text-align:center" >
			<el-table-column prop="orderCreatetime" label="时间" min-width="180" :formatter="formtData" sortable>
			</el-table-column>
			<el-table-column label="操作" min-width="150">
          <template scope="scope">
            <!-- 操作按钮 加点击事件-->
              <el-button type="primary"  @click="handleEdit(scope.$index, scope.row)">详情</el-button>
          </template>
			</el-table-column>
		</el-table>
  </section>
</template>

<script>
  export default{
      data(){
        return {
          // this.orders=data.orders
          orders:[]
        }
      },
      methods:{
        //支付状态转换
          formatPaySta :function(row, column){
            return row.payStatus == false ? '未支付' :  '已支付';
          },
          // 时间格式转换
          formtData :function(row, column){
            var date=new Date(row.orderCreatetime);
            console.log(date.toLocaleString());
            return date.toLocaleString();
            // var year=date.getFullYear();
            // var month= date.getMonth()+1<10 ? "0"+(date.getMonth()+1) : date.getMonth()+1;
            // var day=date.getDate()<10 ? "0"+date.getDate() : date.getDate();
            // var hours=date.getHours()<10 ? "0"+date.getHours() : date.getHours();
            // var minutes=date.getMinutes()<10 ? "0"+date.getMinutes() : date.getMinutes();
            // var seconds=date.getSeconds()<10 ? "0"+date.getSeconds() : date.getSeconds();
            // return year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
          }

      },
      created:function(){
        this.$api.findAllOrder().then(response=>{
        console.log(response.data);
        this.orders=response.data;
        console.log(response.data);
      });
    }
  }
</script>

<style>

</style>
