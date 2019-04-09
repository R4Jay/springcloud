import Vue from 'vue'
import Router from 'vue-router'
// import HelloWorld from '@/components/HelloWorld'
import Main from '@/pages/Main'
import Dashboard from '@/pages/Dashboard'
import Member from "@/pages/Member"

Vue.use(Router)

let routes = [{
  path: '/',
  component: Main,
  hidden: true,
  children: [{
    path: '/',
    component: Dashboard,
    name: '首页'
  }]
}]

routes.push({
  path:'/member',
  component:Main,
  iconCls: 'fa fa-user-circle-o',
  children:[{
    path:'/member/data',
    component:Member,
    name:'会员信息管理'
  }]

})
const router = new Router({
  routes: routes,
  //去掉难看的#符号,当时需要搞定后端映射匹配
  mode: 'history'
})

// export default new Router({
//   routes: [
//     {
//       path: '/',
//       name: 'HelloWorld',
//       component: HelloWorld
//     }
//   ]
// })
export default router
