package in.codeshuffle.mvpskeleton.ui.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by skymansandy on 24/05/17.
 */

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    private int mCurrentPosition;

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    protected abstract void clear();

    public void onBind(int position) {
        mCurrentPosition = position;
        clear();
    }

    public int getCurrentPosition() {
        return mCurrentPosition;
    }
}
