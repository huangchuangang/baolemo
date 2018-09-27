<template>
  <el-form :model="loginForm" :ref="loginForm" :rules="ruleInline" class="login-container" label-position="left"
           label-width="0px" >
    <h3 class="login_title">系统登录</h3>
    <el-form-item prop="userName">
      <el-input type="text" v-model="loginForm.userName" auto-complete="off" placeholder="账号"></el-input>
    </el-form-item>
    <el-form-item prop="userPassword">
      <el-input type="password" v-model="loginForm.userPassword" auto-complete="off" placeholder="密码"></el-input>
    </el-form-item>
    <el-checkbox class="login_remember" v-model="checked" label-position="center" >记住密码</el-checkbox>
    <el-form-item style="width: 100%">
      <el-button type="primary" @click.native.prevent="submitClick()" style="width: 100%">登录</el-button>
    </el-form-item>
  </el-form>
</template>
<script>

export default{
 data() {
   return {
     loginForm: {
       userName: '',
       userPassword: ''
     },

     ruleInline: {
       userName: [
         { required: true, message: '请输入用户名', trigger: 'blur'}
       ],
       userPassword: [
         { required: true, message: '请输入密码', trigger: 'blur'}
       ]
     },
     checked: true
   }
 },
 methods: {
   submitClick(){

     if(this.loginForm.userName==''||this.loginForm.userPassword==''){
        alert("输入用户名或密码");
      }
    else{
     let data = {
       "userName": this.loginForm.userName,
       "userPassword": this.loginForm.userPassword
        }
     this.$store.dispatch('userLogin',{data})
   }
   }
}
}
</script>
<style>
  .login-container {
    border-radius: 15px;
    background-clip: padding-box;
    margin: 180px auto;
    width: 350px;
    padding: 35px 35px 15px 35px;
    background: #fff;
    border: 1px solid #eaeaea;
    box-shadow: 0 0 25px #cac6c6;
  }

  .login_title {
    margin: 0px auto 40px auto;
    text-align: center;
    color: #505458;
  }

  .login_remember {
    margin: 0px 0px 35px 0px;
    text-align: center;
  }
</style>
