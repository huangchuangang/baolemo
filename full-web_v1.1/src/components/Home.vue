<template>
	<el-row class="container">
		<!--顶部-->
		<el-col  class="header">
      <el-col :span="10" class="logo" >
      {{sysName}}
    </el-col>

    <!--显示用户名 图片-->
    <el-col :span="10" class="userinfo">
      <el-dropdown trigger="hover">
      <span class="el-dropdown-link userinfo-inner">{{userName}}</span>
        <el-dropdown-menu slot="dropdown">
          <!-- <el-dropdown-item>设置</el-dropdown-item> 设置用户名密码-->
          <el-dropdown-item  @click.native="logout">退出登录</el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>
    </el-col>
		</el-col>
		<!--主体-->
		<el-col  class="main">
			<aside class="menu-expanded">
				<!--导航菜单-->
        <el-menu :default-active="$route.path" class="el-menu-vertical-demo" background-color="#EEF6F6" unique-opened router >
					 <!--路由跳转： unique-opened router -->
					<template v-for="(item,index) in $router.options.routes" v-if="!item.hidden"><!--选择要显示的路由-->
						<el-submenu :index="index+''" v-if="!item.leaf"><!--只有一个分支时 不成立 跳过-->
							<template slot="title"><i :class="item.iconCls"></i>{{item.name}}</template>
							<el-menu-item v-for="child in item.children" :index="child.path" :key="child.path" v-if="!child.hidden">{{child.name}}</el-menu-item><!--遍历路由子节点-->
						</el-submenu>
						<el-menu-item v-if="item.leaf&&item.children.length>0" :index="item.children[0].path"><i :class="item.iconCls"></i>{{item.children[0].name}}</el-menu-item>
					</template>

				</el-menu>

			</aside>
        <!-- 面包屑栏 -->
			<section class="content-container">
        <div class="grid-content bg-purple-light">
        <el-col class="breadcrumb-container">
          <strong class="title">{{$route.name}}</strong> <!-- $route.name 当前路径名-->
          <!-- <el-breadcrumb separator="/" class="breadcrumb-inner">
            <el-breadcrumb-item v-for="item in $route.matched" :key="item.path">
              {{ item.name }}    <!-- 面包屑 无点击事件 -->
            <!-- </el-breadcrumb-item>
          </el-breadcrumb> -->
					<el-breadcrumb separator="/">
							<el-breadcrumb-item v-for="item in $route.matched" :to="{path:item.path}">{{ item.name }}

					</el-breadcrumb-item>
				</el-breadcrumb>

				<!-- <el-breadcrumb-item><a href="/#/menu">管理</a></el-breadcrumb-item>
				<el-breadcrumb-item><a href="/order">活动管理</a></el-breadcrumb-item> -->

				<!--
				<el-breadcrumb separator="/">
						<el-breadcrumb-item v-for="item in $route.matched" :to="{ path: item.path}">{{ item.name }}
				</el-breadcrumb-item>
			</el-breadcrumb> -->

	  <!-- <el-breadcrumb-item v-for="item in $route.matched" ><a :href="{path: '/#'+item.path}">{{ item.name }}</a></el-breadcrumb-item> -->

</el-breadcrumb>

        </el-col>
        <el-col class="content-wrapper">
          <transition name="fade" mode="out-in">
            <router-view></router-view>
          </transition>
        </el-col>
      </div>
			</section>
		</el-col>
	</el-row>
</template>

<script>
  export default {
    data() {
      return {

          sysName: '饱了么在线点餐系统',
          userName: '社会我宵哥'

      }
    },
    methods: {
      //退出登录
			logout: function () {
				var _this = this;
				this.$confirm('确认退出吗?', '提示', {

				}).then(() => {
					// sessionStorage.removeItem('user');
					_this.$router.push('/login');
				}).catch(() => {

				});
			},

    }
  }
</script>

<style scoped lang="scss">
@import '../styles/vars.scss';


</style>
