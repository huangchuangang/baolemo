import axios from 'axios';
import router from '@/router/index'
import api from '@/api/global'
export default {
  state:{ //这里面是要读取或者写入数据的地方
      userName:' ',
      userPassword:' '
  },
  actions:{
    userLogin({commit},{data}){
     api.login(data)
     .then((response) => {
        commit('userLogin_m',response);
     })
     .catch((error)=>{
        console.log(error);
       }
     );
    }
  },
  mutations:{
    userLogin_m(state,data){
      //第一个参数state是这个模块的state 第二个参数是传进来的数据

      if(data.data.code==200){
// this.$store.dispatch('vx_findAllOrder');
        router.push({ path: '/order' }) ;

      }
      else {

        alert("用户名或密码错误，请重输入！");

      }

    }
  }
}
