class Data{
    private Integer num;
    private String name;
    Data(int _num, String _name){
        this.num = _num;
        this.name = _name;
    }

    public void setNum(Integer _num){
        this.num= _num;
    }

    public void setName(String _name){
        this.name = _name;
    }

    public Integer getNum(){
        return num;
    }

    public String getName(){
        return name;
    }
}

public class CustomClass {

    public static void main(String[] args){
        Data dataObj = new Data(9, "shubham");
        Data dataObj1 = new Data(8,"sk");
        dataObj1.setName ( "skk");
        System.out.println(dataObj1.getName());
    }
}