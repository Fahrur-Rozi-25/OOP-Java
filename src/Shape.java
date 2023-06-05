import java.util.Date;

public class Shape extends Rectangle {
    @Override
    int getCorner() {
        return 44;
    }
    int getParentCorner(){
        return super.getCorner();
    }
}
