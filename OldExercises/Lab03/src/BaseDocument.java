public abstract class BaseDocument implements Document{
    String name;
    protected String data;
    BaseDocument(String name){
        this.name=name;
        this.data="";
    }

    @Override
    public String getContent() {
        return data;
    }

    @Override
    public void display() {
        System.out.println("Dokument: " + name);
        System.out.println("Treść: " + getContent());
        
    }
}
