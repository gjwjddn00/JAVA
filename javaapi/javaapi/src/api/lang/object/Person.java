package api.lang.object;

public class Person extends Object implements Cloneable {
    /*모든 클래스는 object클래스를 상속받음 (생략) */

    private String name;
    //alt + insert
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        //객체의 주소가 아니고, 이름이 같으면 true반환
        if( obj instanceof Person ) {
            Person p = (Person)obj;

            if(p.getName().equals(name) ) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println( super.toString() + "객체 소멸됨" );
    }

    //객체를 복사해서 반환)
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
