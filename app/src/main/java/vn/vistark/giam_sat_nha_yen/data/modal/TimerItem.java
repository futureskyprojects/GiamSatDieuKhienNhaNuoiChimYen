package vn.vistark.giam_sat_nha_yen.data.modal;

import java.util.ArrayList;
import java.util.List;

import vn.vistark.giam_sat_nha_yen.utils.TimeUtils;

public class TimerItem {
    private long id = -1;
    private String label = "";
    private String port = "";
    private boolean power = false;
    private boolean state = false;
    private String start = "";
    private String end = "";
    private String detail = "";

    public TimerItem() {

    }

    public void update(TimerItem timerItem) {
        this.id = timerItem.getId();
        this.label = timerItem.getLabel();
        this.port = timerItem.getPort();
        this.power = timerItem.isPower();
        this.state = timerItem.isState();
        this.start = timerItem.getStart();
        this.end = timerItem.getEnd();
        this.detail = timerItem.getDetail();
    }

    public boolean compare(TimerItem timerItem) {
        return this.id != timerItem.getId() ||
                !this.label.equals(timerItem.getLabel()) ||
                !this.port.equals(timerItem.getPort()) ||
                this.power != timerItem.isPower() ||
                this.state != timerItem.isState() ||
                !this.start.equals(timerItem.getStart()) ||
                !this.end.equals(timerItem.getEnd()) ||
                !this.detail.equals(timerItem.getDetail());
    }

    public TimerItem(long id, String label, String port, boolean power, boolean state, String start, String end, String detail) {
        this.id = id;
        this.label = label;
        this.port = port;
        this.power = power;
        this.state = state;
        this.start = TimeUtils.timerToStandard(start);
        this.end = TimeUtils.timerToStandard(end);
        this.detail = detail;
    }

    public TimerItem(String id, String label, String port, String power, String state, String start, String end, String detail) {
        this.id = Integer.parseInt(id);
        this.label = label;
        this.port = port;
        this.power = Boolean.parseBoolean(power);
        this.state = Boolean.parseBoolean(state);
        this.start = TimeUtils.timerToStandard(start);
        this.end = TimeUtils.timerToStandard(end);
        this.detail = detail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public boolean isPower() {
        return power;
    }

    public TimerItem setPower(boolean power) {
        this.power = power;
        return this;
    }

    public void setPower(String power) {
        this.power = Boolean.parseBoolean(power);
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = Boolean.parseBoolean(state);
    }

    public String getStart() {
        return TimeUtils.timerToStandard(start);
    }

    public void setStart(String start) {
        this.start = TimeUtils.timerToStandard(start);
    }

    public String getEnd() {
        return TimeUtils.timerToStandard(end);
    }

    public void setEnd(String end) {
        this.end = TimeUtils.timerToStandard(end);
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
