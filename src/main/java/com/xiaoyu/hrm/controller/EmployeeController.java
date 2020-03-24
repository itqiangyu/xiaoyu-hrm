package com.xiaoyu.hrm.controller;

import com.xiaoyu.hrm.pojo.Employee;
import com.xiaoyu.hrm.pojo.ResultBean;
import com.xiaoyu.hrm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 处理员工请求
 * 
 * @author xiaoyu
 * @date 2020/3/24 13:14
 */
@RestController
@RequestMapping("/employee/basic")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 根据条件查询员工
     * @param page 从page开始查询
     * @param size 每次查询size个
     * @param employee 条件
     * @param positionId 职位id
     * @param departmentId 部门id
     * @return 返回查询的结果
     */
    @GetMapping("/")
    public ResultBean findAllEmployee(@RequestParam(defaultValue = "1") Integer page,
                                      @RequestParam(defaultValue = "10") Integer size,
                                      Employee employee, Integer positionId, Integer departmentId) {
        return employeeService.findAllEmployee(page, size, employee, positionId, departmentId);
    }

    /**
     * 获取56民族
     * @return 返回56个民族
     */
    @GetMapping("/nations")
    public ResultBean getAllNations() {
        return employeeService.getAllNations();
    }

    /**
     * 获取政治面貌
     * @return 返回政治面貌
     */
    @GetMapping("/politicsstatus")
    public ResultBean getAllPoliticsstatus() {
        return employeeService.getAllPoliticsstatus();
    }

    /**
     * 添加员工
     * @param employee 信息
     * @param positionId 职位id
     * @param departmentId 部门id
     * @return 返回操作结果
     */
    @PostMapping("/")
    public ResultBean powerInsertEmployee(Employee employee, Integer positionId, Integer departmentId) {
        return employeeService.insertEmployee(employee, positionId, departmentId);
    }

    /**
     * 更新员工信息
     * @param employee 信息
     * @param positionId 职位id
     * @param departmentId 部门id
     * @return 返回操作结果
     */
    @PutMapping("/")
    public ResultBean powerUpdateEmployee(Employee employee, Integer positionId, Integer departmentId) {
        return employeeService.updateEmployee(employee, positionId, departmentId);
    }

    /**
     * 根据员工 id 删除用户
     * @param id 员工id
     * @return 返回操作结果
     */
    @DeleteMapping("/{id}")
    public ResultBean powerDeleteEmployee(@PathVariable("id") Integer id) {
        return employeeService.deleteEmployee(id);
    }

}
