package com.sing.datetimepicker.date;

import java.util.Calendar;

/**
 * @className   DatePickerController
 * @time        2016/9/18 14:04
 * @author      LiangYx
 * @description Controller class to communicate among the various components of the date picker dialog.
 */
public interface DatePickerController {

    void onYearSelected(int year);

    void onDayOfMonthSelected(int year, int month, int day);

    void registerOnDateChangedListener(DatePickerDialog.OnDateChangedListener listener);

    void unregisterOnDateChangedListener(DatePickerDialog.OnDateChangedListener listener);

    MonthAdapter.CalendarDay getSelectedDay();

    boolean isThemeDark();

    int getAccentColor();
    
    Calendar[] getHighlightedDays();

    int getFirstDayOfWeek();

    int getMinYear();

    int getMaxYear();

    Calendar getStartDate();

    Calendar getEndDate();

    boolean isOutOfRange(int year, int month, int day);

    void tryVibrate();
}
