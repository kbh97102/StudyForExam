package displayStar;

public class DisplayStar {
    private int size;
    private String builed[][];

    public DisplayStar(int size){
        this.size = size;
        builed = new String[size*4][size*4];
    }
    public void buildStar(){

    }
    public void topSectionBuild(){
        int yPos = 0;

        for(yPos = 0;yPos<size;yPos++){
            for(int i = size*2-yPos;i<=size*2+yPos;i++){
                builed[yPos][i] = "*";
            }
        }
    }
    public void display(){
        for(int i=0;i<builed.length;i++){
            for(int x=0;x<builed[i].length;x++){
                if(builed[i][x] == null){
                    builed[i][x] = " ";
                }
            }
        }
        for(int i=0;i<builed.length;i++){
            for(int x=0;x<builed[i].length;x++){
                System.out.print(builed[i][x]);
            }
            System.out.println();
        }
    }
}
