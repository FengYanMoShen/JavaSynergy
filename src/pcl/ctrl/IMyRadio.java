/*
package pcl.ctrl;

import java.util.ArrayList;
import java.util.List;

public interface IMyRadio {
    // 定义事件参数类 RouteEventArgs (假设已在其他地方定义)



    // 定义一个自定义的事件接口，用于声明需要实现的方法
    public interface MyRadioEventListener {
        void onCheck(MyRadio source, RouteEventArgs e);
        void onChanged(MyRadio source, RouteEventArgs e);
    }

    // 假设存在一个MyRadio类，它将会触发这些事件
    public class MyRadio {
        // 保存注册的监听器列表
        private List<MyRadioEventListener> listeners = new ArrayList<>();

        // 添加监听器方法
        public void addMyRadioEventListener(MyRadioEventListener listener) {
            listeners.add(listener);
        }

        // 移除监听器方法
        public void removeMyRadioEventListener(MyRadioEventListener listener) {
            listeners.remove(listener);
        }

        // 触发Check事件的方法
        protected void fireOnCheck(RouteEventArgs e) {
            for (MyRadioEventListener listener : listeners) {
                listener.onCheck(this, e);
            }
        }

        // 触发Changed事件的方法
        protected void fireOnChanged(RouteEventArgs e) {
            for (MyRadioEventListener listener : listeners) {
                listener.onChanged(this, e);
            }
        }

    }
}*/
