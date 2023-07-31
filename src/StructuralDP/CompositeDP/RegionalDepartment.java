package StructuralDP.CompositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDepartment extends Department{

    // butun departmanları bir değişken üzerinde kontrol etmek için oluşturuldu iç,nde finance ve sales barındırıyor
    List<Department> childDepartments;

    // parametreli const.
    public RegionalDepartment(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() { // firmada olan butun departmanlarin ismini getirsin
        return childDepartments.stream().// stream yapida departmanlar geliyor
                map(Department::getName).// stream departman isimleri geliyor
                collect(Collectors.joining(", ")); // "Finance, Sales, Arge"
    }

    @Override
    List<String> getEmployees() { // firmada butun calisanların isimleri
        return childDepartments.stream().
                flatMap(d ->d.getEmployees().stream()).
                collect(Collectors.toList());
    }
}
