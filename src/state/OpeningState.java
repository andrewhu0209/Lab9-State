package state;

import context.Context;

/**
 * Created by Zongduo Li on 2021/7/22.
 */
public class OpeningState extends LiftState {
    //执行打开电梯门方法
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    //打开后还可以关闭电梯门
    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(Context.CLOSING_STATE);
        //动作委托为CLOSING_STATE执行
        super.context.getLiftState().close();
    }

    //门开着不能运行
    @Override
    public void run() {

    }

    //门开着已经停止了
    @Override
    public void stop() {

    }
}
