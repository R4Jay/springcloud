// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'

import 'font-awesome/css/font-awesome.min.css'
import ElemnetUI from 'element-ui'
import './assets/theme/element-#409eff/index.css'

//技术栈
//https://blog.csdn.net/xiaoyangerbani/article/details/
//https://www.cnblogs.com/GoodHelper/p/8430422.html

Vue.config.productionTip = false
Vue.use(ElemnetUI)

/* eslint-disable no-new */
//开发模式开启mock.js
if (process.env.NODE_ENV === 'development') {
  require('./mock')
}
//导入Ajax处理
import axios from 'axios'
Vue.prototype.$axios = axios

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: {
    App
  },
  template: '<App/>'
})
