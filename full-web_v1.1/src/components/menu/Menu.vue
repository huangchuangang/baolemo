

<template >
<div >
<el-button  @click="dialogFormVisible = true">修改</el-button>


  <el-dialog title="菜品修改" :visible.sync="dialogFormVisible" >
    <el-container>
      <el-header>
        <el-upload
          class="avatar-uploader"
          action="https://jsonplaceholder.typicode.com/posts/"
          :show-file-list="false"
          :on-success="handleAvatarSuccess"
          :before-upload="beforeAvatarUpload">
          <img v-if="imageUrl" :src="imageUrl" class="avatar">
          <i v-else class="el-icon-plus avatar-uploader-icon"></i>
        </el-upload>
</el-header>
</el-container>

  <el-dialog :visible.sync="dialogVisible" >
    <img width="100%" :src="dialogImageUrl" alt="" >
  </el-dialog>
  <el-container>

  <el-form :model="form" >
    <el-form-item label="菜品名称" :label-width="formLabelWidth">
      <el-input v-model="form.name" autocomplete="off"></el-input>
    </el-form-item>

    <el-form-item label="菜品价格" :label-width="formLabelWidth">
      <el-input v-model="form.price" autocomplete="off"></el-input>
    </el-form-item>

    <el-form-item label="类目" :label-width="formLabelWidth">
      <el-select v-model="form.kind" placeholder="请选择类目">
        <el-option label="粤菜" value="yuecai"></el-option>
        <el-option label="小炒" value="xiaochao"></el-option>
        <el-option label="米饭" value="mifan"></el-option>
        <el-option label="汤类" value="tanglei"></el-option>
      </el-select>
    </el-form-item>
  </el-form>

</el-container>
  <div slot="footer" class="dialog-footer">
    <el-button @click="dialogFormVisible = false">取 消</el-button>
    <el-button type="primary" @click="dialogFormVisible = false">确 定</el-button>
  </div>

</el-dialog>

</div>
</template>
<script>
  export default {
    data() {
      return {
        ImageUrl: '',
        dialogVisible: false,
        dialogFormVisible: false,
        form: {
          name: '',
          price: '',
          kind: ''
        },
        formLabelWidth: '270px'
      };
    },
    methods: {
      handleAvatarSuccess(res, file) {
       this.imageUrl = URL.createObjectURL(file.raw);
     },
     beforeAvatarUpload(file) {
       const isJPG = file.type === 'image/jpeg';
       const isLt2M = file.size / 1024 / 1024 < 2;

       if (!isJPG) {
         this.$message.error('上传图片只能是 JPG 格式!');
       }
       if (!isLt2M) {
         this.$message.error('上传图片大小不能超过 2MB!');
       }
       return isJPG && isLt2M;
     }
   }
  }
</script>

<style>
.menu{
  width: auto;
  height: auto;
  background-color: red;
}
.avatar-uploader .el-upload {
    border: 1px dashed #d9d9d9;
    border-radius: 6px;
    cursor: pointer;
    position: relative;
    overflow: hidden;
  }
  .avatar-uploader .el-upload:hover {
    border-color: #409EFF;
  }
  .avatar-uploader-icon {
    font-size: 28px;
    color: #8c939d;
    width: 178px;
    height: 178px;
    line-height: 178px;
    text-align: center;
  }
  .avatar {
    width: 178px;
    height: 178px;
    display: block;
  }

.el-header{
  background-color: #ffffff;
  color: #333;
  text-align: left;
  padding-top: 100px;
  padding-left: 0px;

}
.el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    line-height: 100px;
  }
.dialog-footer{
  text-align: center;;
}

</style>
