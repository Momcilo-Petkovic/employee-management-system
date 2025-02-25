package net.javaguides.ems_backend.mapper;

import net.javaguides.ems_backend.dto.DepartmentDto;
import net.javaguides.ems_backend.entity.Department;

public class DepartmentMapper {
    // convert Department jpa entity to DepartmentDTO
    public static DepartmentDto mapToDeprtmentDto(Department department){
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDeprtmentDescription()
        );
    }

    //convert department dto into department jpa entity
    public static Department mapToDepartment(DepartmentDto deprtmentDto){
        return new Department(
                deprtmentDto.getId(),
                deprtmentDto.getDepartmentName(),
                deprtmentDto.getDepartmentDescription()
        );
    }
}
