# MaterialDateTimePicker
 
 ![](./app/src/main/res/mipmap-xhdpi/date1.png "")
 ![](./app/src/main/res/mipmap-xhdpi/date2.png "")
 ![](./app/src/main/res/mipmap-xhdpi/time1.png "")
 ![](./app/src/main/res/mipmap-xhdpi/time2.png "")
## apk
[MaterialDateTimePicker-1.0.1-sample.apk](https://github.com/Sing1/MaterialDateTimePicker/blob/master/app.apk)
## gradle:
```groovy
dependencies {
    ...
    compile 'sing.materialdatetimepicker:library:1.0.1'
}
```
## Maven:
```xml
<dependency>
  <groupId>sing.materialdatetimepicker</groupId>
  <artifactId>library</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```
## sample 
```JAVA    
/**
 * 选择时间
 * @param v
 */
public void timeButton(View v){
　　Calendar now = Calendar.getInstance();
　　TimePickerDialog tpd = TimePickerDialog.newInstance(
　　　　MainActivity.this,
　　　　now.get(Calendar.HOUR_OF_DAY),
　　　　now.get(Calendar.MINUTE),
　　　　isMode24Hours// boolean,是否24小时模式
　　);
　　tpd.setThemeDark(isDarkTheme);// boolean,DarkTheme
　　tpd.vibrate(vibrateTime.isChecked());// boolean,触摸震动
　　tpd.dismissOnPause(isDismiss);// boolean,Pause时是否Dismiss
　　tpd.enableSeconds(showSeconds);// boolean,显示秒
　　tpd.enableMinutes(showMinutes);// boolean,显示分
    if (customAccent.isChecked()) {// boolean,自定义颜色
        tpd.setAccentColor(Color.parseColor("#9C27B0"));
    }
    if (title.isChecked()) {// boolean,设置标题
        tpd.setTitle("TimePicker Title");
    }
    if (limitTimes.isChecked()) {// boolean,限制部分时间
        tpd.setTimeInterval(2, 5, 10);
    }
    tpd.setOnCancelListener(new DialogInterface.OnCancelListener() {
        @Override
        public void onCancel(DialogInterface dialogInterface) {
            Log.d("Time", "点击了取消");
        }
    });
    tpd.show(getFragmentManager(), "Timepickerdialog");
  }

/**
 * 日期选择
 * @param v
 */
public void dateButton(View v){
　　Calendar now = Calendar.getInstance();
　　DatePickerDialog dpd = DatePickerDialog.newInstance(
　　　　MainActivity.this,
　　　　now.get(Calendar.YEAR),
　　　　now.get(Calendar.MONTH),
　　　　now.get(Calendar.DAY_OF_MONTH)
　　);
　　dpd.setThemeDark(modeDarkDate.isChecked());
　　dpd.vibrate(vibrateDate.isChecked());
　　dpd.dismissOnPause(dismissDate.isChecked());
　　dpd.showYearPickerFirst(showYearFirst.isChecked());
　　if (modeCustomAccentDate.isChecked()) {
　　　　dpd.setAccentColor(Color.parseColor("#9C27B0"));
　　}
　　if (titleDate.isChecked()) {
　　　　dpd.setTitle("DatePicker Title");
　　}
　　if (limitDates.isChecked()) {
　　　　Calendar[] dates = new Calendar[13];
　　　　for (int i = -6; i <= 6; i++) {
　　　　　　Calendar date = Calendar.getInstance();
　　　　　　date.add(Calendar.MONTH, i);
　　　　　　dates[i + 6] = date;
　　　　}
　　　　dpd.setSelectableDays(dates);
　　}
    if (highlightDates.isChecked()) {
        Calendar[] dates = new Calendar[13];
        for (int i = -6; i <= 6; i++) {
            Calendar date = Calendar.getInstance();
            date.add(Calendar.WEEK_OF_YEAR, i);
            dates[i + 6] = date;
        }
        dpd.setHighlightedDays(dates);
    }
    if (disableDates.isChecked()) {
        Calendar[] dates = new Calendar[3];
        for (int i = -1; i <= 1; i++) {
            Calendar date = Calendar.getInstance();
            date.add(Calendar.DAY_OF_MONTH, i);
            dates[i + 1] = date;
        }
        dpd.setDisabledDays(dates);
    }
    dpd.show(getFragmentManager(), "Datepickerdialog");
} 

// implements TimePickerDialog.OnTimeSetListener
@Override
public void onTimeSet(RadialPickerLayout view, int hourOfDay, int minute, int second) {
    String hourString = hourOfDay < 10 ? "0" + hourOfDay : "" + hourOfDay;
    String minuteString = minute < 10 ? "0" + minute : "" + minute;
    String secondString = second < 10 ? "0" + second : "" + second;
    String time = "选择的时间: " + hourString + ":" + minuteString + ":" + secondString;
    
    Log.d("Time", time); 
}

// implements DatePickerDialog.OnDateSetListener
@Override
public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
    String date = "选择的日期: " + year + "-" + (++monthOfYear) + "-" + dayOfMonth;
    
    Log.d("Date", date);  
}　
```
