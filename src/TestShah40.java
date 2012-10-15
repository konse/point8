
public class TestShah40 {
    static String []poleA={"A","B","C","D","E","F","G","H"};
    static String[]arrVariantov=new String[200];
    static int schetchicVar=0;


    public static void main(String []args){
        boolean [][]partiya = new boolean[8][8];
        ferz1(partiya);
        System.out.print("BCE "+schetchicVar);
    }


    private static void ferz1(boolean [][] partiya){
        for(int iv=0;iv<8;iv++){
            for(int ig=0;ig<8;ig++){
                if(!inspection(partiya,ig,iv)){
                    partiya[ig][iv]=true;
                    ferz2(partiya);
                    partiya[ig][iv]=false;
                }
            }
        }
      return;
    }
    private static void ferz2(boolean[][] partiya){
        for(int iv=0;iv<8;iv++){
            for(int ig=0;ig<8;ig++){
                if(!inspection(partiya,ig,iv)){
                    partiya[ig][iv]=true;
                    ferz3(partiya);
                    partiya[ig][iv]=false;
                }
            }
        }
        return ;
    }
    private static void ferz3(boolean[][] partiya){
        for(int iv=0;iv<8;iv++){
            for(int ig=0;ig<8;ig++){
                if(!inspection(partiya,ig,iv)){
                    partiya[ig][iv]=true;
                    ferz4(partiya);
                    partiya[ig][iv]=false;
                }
            }
        }
        return ;
    }
    private static void ferz4(boolean[][] partiya){
        for(int iv=0;iv<8;iv++){
            for(int ig=0;ig<8;ig++){
                if(!inspection(partiya,ig,iv)){
                    partiya[ig][iv]=true;
                    ferz5(partiya);
                    partiya[ig][iv]=false;
                }
            }
        }
        return ;
    }
    private static void ferz5(boolean[][] partiya){
        for(int iv=0;iv<8;iv++){
            for(int ig=0;ig<8;ig++){
                if(!inspection(partiya,ig,iv)){
                    partiya[ig][iv]=true;
                    ferz6(partiya);
                    partiya[ig][iv]=false;
                }
            }
        }
        return ;
    }
    private static void ferz6(boolean[][] partiya){
        for(int iv=0;iv<8;iv++){
            for(int ig=0;ig<8;ig++){
                if(!inspection(partiya,ig,iv)){
                    partiya[ig][iv]=true;
                    ferz7(partiya);
                    partiya[ig][iv]=false;
                }
            }
        }
        return ;
    }
    private static void ferz7(boolean[][] partiya){
        for(int iv=0;iv<8;iv++){
            for(int ig=0;ig<8;ig++){
                if(!inspection(partiya,ig,iv)){
                    partiya[ig][iv]=true;
                    ferz8(partiya);
                    partiya[ig][iv]=false;
                }
            }
        }
        return ;
    }
    private static void ferz8(boolean[][] partiya){
        for(int iv=0;iv<8;iv++){
            for(int ig=0;ig<8;ig++){
                if(!inspection(partiya,ig,iv)){
                    partiya[ig][iv]=true;
                    //transliter(partiya);
                    survafe(transliter(partiya));
                    partiya[ig][iv]=false;
                }
            }
        }
        return ;
    }



    private static String transliter (boolean [][]partiya){
        String p="";
        for(int ig=0;ig<8;ig++){
            for (int iv=0;iv<8;iv++){
                if(partiya[ig][iv]){
                    p=p+poleA[ig]+""+(iv+1)+" ";
                }
            }
        }
        return p;
    }

    private static void survafe(String p){
        for (int i=0;i<200;i++){
            if(null!=arrVariantov[i] && arrVariantov[i].equals(p))return;
        }
        schetchicVar++;
        arrVariantov[schetchicVar]=p;
        System.out.println(p);
    }

    private static boolean inspection(boolean m[][],int g, int v){
        if (inspectionGoriz(m, g, v)||inspectionVert(m,g,v)||inspectionDiagLN(m,g,v)||inspectionDiagLV(m,g,v)||inspectionDiagPN(m,g,v)||inspectionDiagPV(m,g,v))return true;
        return false;
    }
    private static boolean inspectionGoriz(boolean m[][],int g, int v){
        for (int i=0; i<8;i++){
            if ( true==m[i][v])return true;
        }
        return false;
    }
    private static boolean inspectionVert(boolean m[][],int g, int v){
        for (int i=0; i<8;i++){
            if (true==m[g][i])return true;
        }
        return false;
    }
    private static boolean inspectionDiagLN(boolean m[][],int g, int v){

        for(int i=0; i<8;i++){
            if((g-i)>-1 && (v-i)>-1){
                if(true==m[g-i][v-i]) return true;
            }
        }
        return false;
    }
    private static boolean inspectionDiagPN(boolean m[][],int g, int v){

        for(int i=0; i<8;i++){
            if((g+i)<8 && (v-i)>-1){
                if(true==m[g+i][v-i]) return true;
            }
        }
        return false;
    }
    private static boolean inspectionDiagLV(boolean m[][],int g, int v){
        for(int i=0; i<8;i++){
            if((g-i)>-1 && (v+i)<8){
                if(true==m[g-i][v+i]) return true;
            }
        }
        return false;
    }
    private static boolean inspectionDiagPV(boolean m[][],int g, int v){
        for(int i=0; i<8;i++){
            if((g+i)<8 && (v+i)<8){
                if(true==m[g+i][v+i]) return true;
            }
        }
        return false;
    }
}
