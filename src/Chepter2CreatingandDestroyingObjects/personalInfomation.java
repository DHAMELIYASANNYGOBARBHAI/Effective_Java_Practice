package Chepter2CreatingandDestroyingObjects;

import javax.print.DocFlavor;

public class personalInfomation
{
    private String name;
    private int age;
    private String collageName;


    private personalInfomation(Builder builder)
    {
        this.name = builder.name;
        this.age = builder.age;
        this.collageName = builder.collageName;
    }

    public static class Builder
    {
        private String name;
        private int age;
        private String collageName;

        public Builder setName(String iName)
        {
            this.name = iName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCollageName(String collageName) {
            this.collageName = collageName;
            return this;
        }

        public personalInfomation build()
        {
            return new personalInfomation(this);
        }
    }

    @Override
    public String toString() {
        return "personalInfomation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", collageName='" + collageName + '\'' +
                '}';
    }
}
