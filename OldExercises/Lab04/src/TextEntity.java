public class TextEntity implements Cloneable{

    String tekst;
    String jezyk;
    int id;

    TextEntity(String tekst, String jezyk, int id){
        this.tekst=tekst;
        this.jezyk=jezyk;
        this.id=id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(!(obj instanceof TextEntity))
            return false;

        TextEntity temp=(TextEntity)obj;

        return (temp.jezyk==jezyk&&temp.tekst==tekst);
        //return super.equals(obj);
    }

    @Override
    public String toString() {
        
        return "TextEntity{id="+id+", language='"+jezyk+"', content='"+tekst+"'}";
    }

    String getContent(){
        return tekst;
    }

    @Override
    public int hashCode() {
        int hash=7;
        hash = tekst.hashCode()*31+jezyk.hashCode()*31;
        return hash;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
            TextEntity temp=new TextEntity(tekst, jezyk, id);
            
        return temp;
    }
}
