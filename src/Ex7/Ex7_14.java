class Outer{
    private int outerIv = 0;
    static int outerCv = 0;
    
    class InstnaceInner{
        int ilv = outerIv;
        int ilv2 = outerCv;
    }
    
    static class StaticInner{
        
        static int scv = outerCv;
    }
    
    void myMethod(){
        int lv = 0;
        final int LV = 0;
        
        class LocalInner{
            int liv = outerIv;
            int liv2 = outerCv;
            
            int liv4 = LV;
        }
    }
}