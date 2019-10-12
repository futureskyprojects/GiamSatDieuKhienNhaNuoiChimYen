package vn.vistark.giam_sat_nha_yen.ui.dashboard_screen.timer_list;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;

import vn.vistark.giam_sat_nha_yen.R;
import vn.vistark.giam_sat_nha_yen.ui.dashboard_screen.DashboardScreenActivity;

class TimerListViewHolder extends RecyclerView.ViewHolder {
    private TextView tvTimerItemId;
    private TextView tvTimerItemLabel;
    private TextView tvTimerItemStart;
    private TextView tvTimerItemEnd;
    SwitchCompat scTimerSwitchCompat;
    RelativeLayout rlTimerItemRoot;

    TimerListViewHolder(@NonNull View v) {
        super(v);
        initViews(v);
    }

    private void initViews(View v) {
        tvTimerItemId = v.findViewById(R.id.timerItemId);
        tvTimerItemLabel = v.findViewById(R.id.timerItemLabel);
        tvTimerItemStart = v.findViewById(R.id.timerItemStart);
        tvTimerItemEnd = v.findViewById(R.id.timerItemEnd);
        scTimerSwitchCompat = v.findViewById(R.id.timerSwitchCompat);
        rlTimerItemRoot = v.findViewById(R.id.timerItemRoot);
    }

    void updateTimerItemIdView(String id) {
        tvTimerItemId.setText(id);
    }

    void updateTimerItemLabelView(String label) {
        tvTimerItemLabel.setText(label);
    }

    void updateTimerItemStartView(String start) {
        tvTimerItemStart.setText(start);
    }

    void updateTimerItemEndView(String end) {
        tvTimerItemEnd.setText(end);
    }

    void updateTimerSwitchCompatView(boolean state) {
        scTimerSwitchCompat.setChecked(state);
    }

    void toggleTimerSwitchCompatView() {
        scTimerSwitchCompat.toggle();
    }

    void updateTimerStateView(boolean state) {
        if (state) {
            tvTimerItemId.setBackgroundResource(R.drawable.quepal);
        } else {
            tvTimerItemId.setBackgroundResource(R.drawable.burning_orange);
        }
    }

    void holderUpdateEmptyNotify(int size) {
        if (size > 0) {
            ((DashboardScreenActivity) tvTimerItemId.getContext()).hideTimerListEmptyNotify();
        } else {
            ((DashboardScreenActivity) tvTimerItemId.getContext()).showTimerListEmptyNotify();
        }
    }
}