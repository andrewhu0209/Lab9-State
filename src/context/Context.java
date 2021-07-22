package context;

import state.LiftState;
import state.OpeningState;

/**
 * Created by Zongduo Li on 2021/7/22.
 */
public class Context {
    //定义出电梯的所有状态
    public static final LiftState OPENNING_STATE = new OpeningState();
    public static final LiftState CLOSING_STATE = new OpeningState();
    public static final LiftState RUNNING_STATE = new OpeningState();
    public static final LiftState STOPPING_STATE = new OpeningState();

    //定义一个当前电梯状态
    private LiftState liftState;

    public LiftState getLiftState(){
        return liftState;
    }

    public void setLiftState(LiftState liftState){
        this.liftState = liftState;
        //通知到各个实现类中
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }
}
