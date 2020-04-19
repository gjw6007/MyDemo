package com.example.mybehavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class MyBenavior extends CoordinatorLayout.Behavior {
    private float deltaY;
    public MyBenavior() {
    }

    public MyBenavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(@NonNull CoordinatorLayout parent, @NonNull View child, @NonNull View dependency) {
        return super.layoutDependsOn(parent, child, dependency);
    }
    //child顶部的标题layout,dependency是recyclerview

    @Override
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout parent, @NonNull View child, @NonNull View dependency) {
        if(deltaY==0){
            deltaY=dependency.getY()-child.getHeight();//初始化的时候计算recy的移动位移
        }
        float dy=dependency.getY()-child.getHeight();//每次刷新的时候recyclerview移动位移
        dy=dy<0?0:dy;
        float y=-(dy/deltaY)*child.getHeight();//计算对方需要移动的位移
        child.setTranslationY(y);
        return true;
    }
}
