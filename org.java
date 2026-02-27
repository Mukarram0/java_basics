package practice;

interface payable
{
    void calculatesalary();
}
abstract class employee
{
String name;
int emp_id;
double base_sal;
}
class Fulltimeemploy extends employee implements payable
{
    double hra;
    Fulltimeemploy(String a,int id,double sal,double hr)
    {
        name=a;
        emp_id=id;
        base_sal=sal;
        hra=hr;
    }
    public void calculatesalary()
    {
        double salary=base_sal+hra;
        System.out.println("______________________fulltimeemploy____________________");
        System.out.println("name= "+name+"\n"+"emp_id= "+emp_id+"\n"+"salary= "+salary);
        System.out.println("______________________end____________________");
    }
}
class parttimeemploy extends employee implements payable
{
    double hourly_wage;
    double hours_work;
    parttimeemploy(String a,int id,double hrs_sal,double hrs_wrk)
    {
        name=a;
        emp_id=id;
        hourly_wage=hrs_sal;
        hours_work=hrs_wrk;
    }
    public void calculatesalary()
    {
        double salary=hourly_wage*hours_work;
        System.out.println("______________________parttimeemploy____________________");
        System.out.println("name= "+name+"\n"+"emp_id= "+emp_id+"\n"+"salary= "+salary);
        System.out.println("______________________end____________________");
    }
}
public class org {
    public static void main(String[] args) {
        Fulltimeemploy ft=new Fulltimeemploy("rohit",01,25400,1000);
        parttimeemploy pt=new parttimeemploy("qausain",02,2400,5.5);
        ft.calculatesalary();
        pt.calculatesalary();
    }
}
