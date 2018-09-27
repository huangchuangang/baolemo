<template>
  <section>
    <!--工具条-->
		<el-col :span="24" class="toolbar" style="padding-bottom: 0px;">
			<el-form :inline="true" :model="loginForm"><!--输入框长度-->
				<el-form-item>
					<el-input v-model="loginForm.kindId" placeholder="类目号"></el-input>
				</el-form-item>
				<el-form-item>
					<el-button type="primary" @click="findKind">查询</el-button>
				</el-form-item>
        <!--添加按钮-->
        <el-form-item>
          <template slot-scope="scope">
					<!-- <el-button  @click="dialogFormVisible = true">新增类目</el-button> -->
          <div>
            <el-button type="text" @click="addDialogVisible = true">新增</el-button>
            <!-- :visible.sync='dialogVisible'></el-dialog> 就只是说，组件el-dialog 的visible 状态可以被组件内部改变。 -->
              <el-dialog title="类目增加"  :visible.sync="addDialogVisible" >
                <el-container>
                  <el-form :model="form" >
                    <el-form-item label="类目名称" :label-width="formLabelWidth">
                      <el-input v-model="form.kindName" autocomplete="off"></el-input>
                    </el-form-item>
                  </el-form>
                </el-container>
                <section slot="footer" class="dialog-footer">
                  <el-button @click="addDialogVisible = false">取消</el-button>
                  <!-- 点击增加，触发增加类目方法 -->
                  <el-button type="primary" @click="addKind">确定</el-button>
                </section>
             </el-dialog>
         </div>
      </template>
		</el-form-item>
	</el-form>

		</el-col>
      <el-table :data="kinds" style="width: 100%;">
  			<el-table-column type="selection" min-width="30">
  			</el-table-column>
  			<el-table-column prop="index" min-width="30">
  			</el-table-column>
  			<el-table-column prop="kindId" label="类目号" min-width="80" sortable>
  			</el-table-column>
  			<el-table-column prop="kindName" label="类目名称" min-width="100" sortable>
  			</el-table-column>
  			<el-table-column prop="kindCreatetime" label="类目创建时间" min-width="140" :formatter="dataFormat1" sortable>
  			</el-table-column>
        <el-table-column prop="kindUpdatetime" label="类目修改时间" max-width="135" :formatter="dataFormat2" sortable>
  			</el-table-column>
  			<el-table-column label="操作" min-width="60">
          <template slot-scope="scope">
                <!-- 修改按钮 -->
                <section>
                  <el-button type="text" @click="boom(scope.row)">修改</el-button>
                  <!-- :visible.sync='dialogVisible'></el-dialog> 就只是说，组件el-dialog 的visible 状态可以被组件内部改变。 -->
                    <el-dialog title="修改类目"  :visible.sync="dialogVisible" >
                    <el-container>
                      <el-form :model="form1" >
                        <!-- <el-form-item label="类目Id" :label-width="formLabelWidth">
                          <el-input v-model="form1.kindId" autocomplete="off"></el-input>
                        </el-form-item> -->
                        <el-form-item label="类目名称" :label-width="formLabelWidth">
                          <el-input v-model="form1.kindName" autocomplete="off"></el-input>
                       </el-form-item>
                      </el-form>
                    </el-container>
                    <section slot="footer" class="dialog-footer">
                      <el-button @click="dialogVisible = false">取消</el-button>
                      <!-- 点击增加，触发增加类目方法 -->
                      <el-button type="primary" @click="updateKind">确定</el-button>
                    </section>
                   </el-dialog>
               </section>


              <!-- 删除按钮 -->
              <el-button type="text" @click="boom1(scope.row)">删除</el-button>
                  <!-- 删除按钮 -->
                <!-- <el-button type="text"  @click="handleDelete(scope.$index, scope.row)">删除</el-button> -->

                <!-- <div>
                  <el-button type="text" @click="boom1(scope.row)">删除</el-button>
                  <!-- :visible.sync='dialogVisible'></el-dialog> 就只是说，组件el-dialog 的visible 状态可以被组件内部改变。 -->
                     <!-- <el-dialog title="确认删除此类目？"  :visible.sync="deleteDialogVisible" >
                    <div slot="footer" class="dialog-footer">
                      <el-button @click="deleteDialogVisible = false">否</el-button>
                      <el-button type="primary" @click="deleteKind">是</el-button>
                    </div>
                  </el-dialog>
              </div> -->

            </template>
        	</el-table-column>
        </el-table>
    </section>
  </template>

<script>
  export default{
    data(){
       // gFormVisible: false
       return {
        kinds:[],
        loginForm: {
          kindId:''
        },
        form: {
          kindName:''
        },
        form1: {
          kindName:'',
          kindId:''
        },
        dialogVisible:false,
        addDialogVisible:false,
        deleteDialogVisible:false,
        formLabelWidth: '215px',
        updateId:'',
        deleteId:'',
      }
    },
    methods:{
      // 时间格式转换

      dataFormat1 :function(row, column){
        var date=new Date(row.kindCreatetime);
        // console.log(date.toLocaleString());
        // return date;
        var year=date.getFullYear();
        var month= date.getMonth()+1<10 ? "0"+(date.getMonth()+1) : date.getMonth()+1;
        var day=date.getDate()<10 ? "0"+date.getDate() : date.getDate();
        var hours=date.getHours()<10 ? "0"+date.getHours() : date.getHours();
        var minutes=date.getMinutes()<10 ? "0"+date.getMinutes() : date.getMinutes();
        var seconds=date.getSeconds()<10 ? "0"+date.getSeconds() : date.getSeconds();
        return year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
      },

      dataFormat2 :function(row,column){
        var date = new Date(row.kindUpdatetime);
        var year=date.getFullYear();
        var month= date.getMonth()+1<10 ? "0"+(date.getMonth()+1) : date.getMonth()+1;
        var day=date.getDate()<10 ? "0"+date.getDate() : date.getDate();
        var hours=date.getHours()<10 ? "0"+date.getHours() : date.getHours();
        var minutes=date.getMinutes()<10 ? "0"+date.getMinutes() : date.getMinutes();
        var seconds=date.getSeconds()<10 ? "0"+date.getSeconds() : date.getSeconds();
        return year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;

      },

      //插入(新增)一个类目
      addKind: function(form){
        // console.log("add");
        let data={
          "kindName": this.form.kindName,

        }
        console.log(data.kindName)
        this.$api.addOneKind(data);
        this.$api.getAllKinds().then(response=>{
          console.log(response);
        // console.log(response.data);
        this.kinds=response.data;
        //console.log(response.data);
      });
        this.addDialogVisible = false
      },

      //修改类目弹框
      boom: function(row){
        this.updateId=row.kindId
        this.dialogVisible = true
      },

      // 修改类目
      updateKind: function(form1){
        console.log("update");
        let data={
          // "kindId":this.row.kindId,
          "kindName":this.form1.kindName,
          // "kindId": this.updateId
          "kindId": this.updateId
        }
        console.log(data.kindName)
        console.log(data.kindId);
        this.$api.updateOneKind(data);
        this.$api.getAllKinds().then(response=>{
          console.log(response);
        // console.log(response.data);
        this.kinds=response.data;
        //console.log(response.data);
      });
        this.dialogVisible = false
      },

      //删除类目
      boom1: function (row) {
				var _this = this;
				this.$confirm('确认删除类目吗?', '提示', {
					//type: 'warning'
				}).then(() => {
          let data={
            "kindId":row.kindId
          }
          console.log(data.kindId)
  				this.$api.deleteOneKind(data);
          this.$api.getAllKinds().then(response=>{
            console.log(response);
          // console.log(response.data);
          this.kinds=response.data;
          //console.log(response.data);
        });
				}).catch(() => {

				});
			},

      // 删除类目弹框
      // boom1: function(row){
      //    this.deleteId=row.kindId
      //    // 弹框可见
      //   this.deleteDialogVisible = true
      // },
      //删除类目
      // deleteKind: function(){
      //   let data={
      //     "kindId":this.deleteId
      //   }
      //   console.log(data.kindId)
      //   this.$api.deleteOneKind(data);
      //   this.deleteDialogVisible=false
      // },

      //查询一个类目
      findKind: function(loginForm){
        let data={
          "kindId": this.loginForm.kindId
        }
        console.log(data);
        this.$api.getOneKind(data).then(response=>{
          console.log(response);
           this.kinds = response.data;
        });
      }
    },

    //查询所有类目
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
<style scoped>
</style>
