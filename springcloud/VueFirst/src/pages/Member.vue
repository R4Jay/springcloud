<template>
  <section>
    <!--工具条-->
    <el-col :span="24" class="toolbar" style="padding-bottom: 0px;">
      <el-form :inline="true" :model="filters">
        <el-form-item>
          <el-input v-model="filters.query" placeholder="姓名/手机号等条件" />
        </el-form-item>
        <el-form-item>
          <el-button type="primary" v-on:click="getRows" icon="el-icon-search">查询</el-button>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" v-on:click="handleAdd" icon="el-icon-plus">添加</el-button>
        </el-form-item>
      </el-form>
    </el-col>
    <el-table :data="rows" style="width: 100%" stripe border>
      <el-table-column label="注册日期" width="180">
        <template slot-scope="scope">
          <i class="el-icon-time"></i>
          <span style="margin-left: 10px">{{ scope.row.date }}</span>
        </template>
      </el-table-column>
      <el-table-column label="姓名" width="180" :show-overflow-tooltip="true">
        <template slot-scope="scope">
          <el-popover trigger="hover" placement="top">
            <p>姓名: {{ scope.row.name }}</p>
            <p>住址: {{ scope.row.address }}</p>
            <div slot="reference" class="name-wrapper">
              <el-tag size="medium">{{ scope.row.name }}</el-tag>
            </div>
          </el-popover>
        </template>
      </el-table-column>
      <el-table-column prop="sex" label="性别" width="100" align="center" :show-overflow-tooltip="true">
        <template slot-scope="scope">
          {{scope.row.sex===1?'男':'女'}}
        </template>
      </el-table-column>
      <el-table-column label="操作">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="primary"
            @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
          <el-button
            size="mini"
            type="danger"
            @click="handleDelete(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </section>
</template>

<script>
  let data = () => {
    return {
      filters: {},
      rows: []
    }
  }

  let handleAdd = function() {

  }

  let handleEdit = function(index, row) {
    console.log(index, row);
  }

  let handleDelete = function(index, row) {
    console.log(index, row);
  }

  let getRows = function() {
    this.rows = []
    this.rows.push({
      date: '2018-05-02',
      name: '王小虎1',
      sex: 1,
      address: '上海市普陀区金沙江路 1518 弄'
    })
    this.rows.push({
      date: '2018-05-04',
      name: '王小虎2',
      sex: 2,
      address: '上海市普陀区金沙江路 1517 弄'
    })
    this.rows.push({
      date: '2018-05-01',
      name: '王小虎3',
      sex: 2,
      address: '上海市普陀区金沙江路 1519 弄'
    })
    this.rows.push({
      date: '2018-05-03',
      name: '王小虎5',
      sex: 1,
      address: '上海市普陀区金沙江路 1516 弄'
    })
  }

  export default {
    data: data,
    methods: {
      //添加
      handleAdd,
      //修改
      handleEdit,
      //删除
      handleDelete,
      //获取分页
      getRows
    },
    mounted: function() {
      this.getRows()
    }
  }
</script>

<style scoped>
</style>

<!--Member.vue-->
