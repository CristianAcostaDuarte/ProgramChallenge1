

public class Node {
   

    private int id1;
    private int id2;
    private int value;
    private Node up;
    private Node down;
    private Node left;
    private Node right;


    public Node(int i,int j ,int v) {
        this.id1= i;
        this.id2=j;
        this.value=v;
        this.up=null;
        this.down = null;
        this.left = null;
        this.right = null;
       }

       public Node(int i,int j ,int v, Node w, Node s, Node a, Node d) {
        this.id1= i;
        this.id2=j;
        this.value=v;
        this.up=w;
        this.down = s;
        this.left = a;
        this.right = d;
    }

    public Node( ) {
        this.id1= -1;
        this.id2= -1;
        this.value=0;
        this.up = null;
        this.down = null;
        this.left = null;
        this.right = null;
    }


    public int getId1(){return this.id1;}
    public int getId2(){return this.id2;}
    public int getValue(){return this.value;}
    public Node getUp(){return this.up;}
    public Node getDown(){return this.down;}
    public Node getLeft(){return this.left;}
    public Node getRight(){return this.right;}
    public void setId1(int i){ this.id1=i;}
    public void setId2(int i){ this.id2=i;}
    public void setValue(int i){ this.value=i;}
    public void setUp(int i,int j,  int v){ this.up=new Node(i,j,v);}
    public void setDown(int i, int j, int v){this.down=new Node(i,j,v);}
    public void setLeft(int i, int j, int v){this.left=new Node(i,j,v);}
    public void setRight(int i,int j,  int v){this.right=new Node(i,j,v);}
 
    @Override
    public String toString() {
        return("id1:"+ this.id1 + " "+ "id2:"+ this.id2 + " " +  "value:"+ this.value + " " + "up:"+ this.up.getValue() + " " + "down:"+ this.down.getValue() + " " + "left:"+ this.left.getValue() + " " + "right:"+ this.right.getValue()) ;
    }


}
