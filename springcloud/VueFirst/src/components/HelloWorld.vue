<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
  <!--  <h2>Essential Links</h2>
    <ul>
      <li>
        <a
          href="https://vuejs.org"
          target="_blank"
        >
          Core Docs
        </a>
      </li>
      <li>
        <a
          href="https://forum.vuejs.org"
          target="_blank"
        >
          Forum
        </a>
      </li>
      <li>
        <a
          href="https://chat.vuejs.org"
          target="_blank"
        >
          Community Chat
        </a>
      </li>
      <li>
        <a
          href="https://twitter.com/vuejs"
          target="_blank"
        >
          Twitter
        </a>
      </li>
      <br>
      <li>
        <a
          href="http://vuejs-templates.github.io/webpack/"
          target="_blank"
        >
          Docs for This Template
        </a>
      </li>
    </ul>
    <h2>Ecosystem</h2>
    <ul>
      <li>
        <a
          href="http://router.vuejs.org/"
          target="_blank"
        >
          vue-router
        </a>
      </li>
      <li>
        <a
          href="http://vuex.vuejs.org/"
          target="_blank"
        >
          vuex
        </a>
      </li>
      <li>
        <a
          href="http://vue-loader.vuejs.org/"
          target="_blank"
        >
          vue-loader
        </a>
      </li>
      <li>
        <a
          href="https://github.com/vuejs/awesome-vue"
          target="_blank"
        >
          awesome-vue
        </a>
      </li>
    </ul>-->

    <div id="xxx">
      <table>
        <tr>
          <th>序号</th>
          <th>商品名称</th>
          <th>商品价格</th>
          <th>购买数量</th>
          <th>操作</th>
        </tr>
        <tr v-for="iphone in Iphone_Json" :key="iphone.id">
          <td>{{ iphone.id }}</td>
          <td>{{ iphone.name }}</td>
          <td>{{ iphone.price }}</td>
          <td>
            <button v-bind:disabled="iphone.count === 0" v-on:click="iphone.count-=1">-</button>
            {{ iphone.count }}
            <button v-on:click="iphone.count+=1">+</button>
          </td>
          <td>
            <button v-on:click="iphone.count=0">移除</button>
          </td>
        </tr>
      </table>
      <!--总价：${{totalPrice()}}-->
    </div>
  </div>
</template>
<script>

// import Vue from 'vue'

export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
// let vm = new Vue({
//   el: '#xxx',
//   data: {
//     Iphone_Json: [{
//       id: 1,
//       name: 'iphone 8',
//       price: 5099,
//       count: 1
//     },
//     {
//       id: 2,
//       name: 'iphone xs',
//       price: 8699,
//       count: 1
//     },
//     {
//       id: 3,
//       name: 'iphone xr',
//       price: 6499,
//       count: 1
//     }]
//   },
//   methods: {
//     // totalPrice: function () {
//     //   let totalP = 0
//     //   for (let i = 0, len = this.Iphone_Json.length; i < len; i++) {
//     //     totalP += this.Iphone_Json[i].price * this.Iphone_Json[i].count
//     //   }
//     //   return totalP
//     // }
//   }
// })
// Vue.use({vm})
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
