<template>
  <section>
    <!--工具条-->
		<el-col :span="24" class="toolbar" style="padding-bottom: 0px;">
			<el-form :inline="true" ><!--输入框长度-->
				<el-form-item>
					<el-input  placeholder="类目号"></el-input>
				</el-form-item>
				<el-form-item>
					<el-button type="primary" >查询</el-button>
				</el-form-item>
        <!--添加按钮-->
        <el-form-item>
					<el-button  @click="dialogFormVisible = true">新增类目</el-button>
				</el-form-item>

			</el-form>
		</el-col>


      <!--列表-->
      <!-- <el-table:data="kinds" style="width:100%">
        <el-table-column type="selection" min-width:"55">
          </el-table-column>
        <el-table-column prop="index" min-width="60">
          </el-table-column>
        <el-table-column prop="kindId" label="类目号" min-width:"130" sortable>
          </el-table-column>
        <el-table-column prop="kindName" label="类目名称" min-width:"130" sortable>
          </el-table-column>
        <el-table-column prop="kindCreateTime" label="类目创建时间" min-width="180" :formatter="formtData" sortable>
          </el-table-column>
          <el-table-column prop="kindUpdateTime" label="类目修改时间" min-width="180" :formatter="formtData" sortable>
            </el-table-column>
          <el-table-column label="操作" min-width:"150px">
            <template>
              <el-button type="primary" @click="handleUpdate(scope.$index,scoope.row)">
                修改</el-button>
              </template>
            </el-table-column>
            <el-table-column label="操作" min-width:"150px">
              <template >
                <el-button type="primary" @click="handleDelete(scope.$index,scoope.row)">
                  删除</el-button>
                </template>
              </el-table-column>
      </el-table>  -->

      <el-table :data="kinds" style="width: 100%;">
  			<el-table-column type="selection" min-width="25">
  			</el-table-column>
  			<el-table-column prop="index" min-width="30">
  			</el-table-column>
  			<el-table-column prop="kindId" label="类目号" min-width="70" sortable>
  			</el-table-column>
  			<el-table-column prop="kindName" label="类目名称" min-width="90" sortable>
  			</el-table-column>
  			<el-table-column prop="kindCreatetime" label="类目创建时间" min-width="130" :formatter="formtData" sortable>
  			</el-table-column>
        <!-- <el-table-column prop="kindUpdatetime" label="类目修改时间" max-width="130" :formatter="formtData2" sortable>
  			</el-table-column> -->
  			<el-table-column label="操作" min-width="80">
            <template scope="scope">
              <!-- 操作按钮 加点击事件-->
                <el-button type="primary"  @click="handleUpdate(scope.$index, scope.row)">修改</el-button>
            </template>
  			</el-table-column>
      <el-table-column label="操作" min-width="80">
          <template scope="scope">
            <!-- 操作按钮 加点击事件 -->
              <el-button type="primary"  @click="handleDelete(scope.$index, scope.row)">删除</el-button>
          </template>
      </el-table-column>
    </el-table>


  </section>
</template>

<script>
  export default{
    data(){
      return {
        kinds:[]
      }
    },
    methods:{
      // 时间格式转换

      formtData :function(row, column){
        var date=new Date(row.kindCreatetime);
        console.log(date.toLocaleString());
        return date;
        // var year=date.getFullYear();
        // var month= date.getMonth()+1<10 ? "0"+(date.getMonth()+1) : date.getMonth()+1;
        // var day=date.getDate()<10 ? "0"+date.getDate() : date.getDate();
        // var hours=date.getHours()<10 ? "0"+date.getHours() : date.getHours();
        // var minutes=date.getMinutes()<10 ? "0"+date.getMinutes() : date.getMinutes();
        // var seconds=date.getSeconds()<10 ? "0"+date.getSeconds() : date.getSeconds();
        // return year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
      }
      // formtData2 :function(row, column){
      //   var date=new Date(row.kindUpdatetime);
      //   return 1;
      // }

      // dateFormat:function(row, column) {
      //     var date = row[column.property];
      //     if (date == undefined) {
      //       return "";
      //     }
      //     return moment(date).format("YYYY-MM-DD HH:mm:ss");
      // }

    },
    created:function(){
        this.$api.getAllKinds().then(response=>{
          console.log(response);
        // console.log(response.data);
        this.kinds=response.data;
        //console.log(response.data);
      });
    }

  }
</script>
