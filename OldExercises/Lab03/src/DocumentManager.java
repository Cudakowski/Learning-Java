import java.util.ArrayList;

public class DocumentManager {
    static private DocumentManager documentManager;
    ArrayList<Document> list;

    private DocumentManager(){
        list=new ArrayList<>();
    }

    void displayAllDocuments(){
        System.out.println("Lista dokumentów:");
        for(Document i : list){
            i.display();
            System.out.println("---");
        }
    }

    void addDocument(Document d){
        list.add(d);
    }

    static DocumentManager getInstance(){
        if(documentManager==null){
            documentManager = new DocumentManager();
        }

        return documentManager;
    }
}
