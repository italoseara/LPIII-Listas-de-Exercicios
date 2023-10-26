package dev.italoseara.Ex01;

public class Time {
    private long timestamp;

    /**
     * @param hour   the hour of the day
     * @param minute the minute of the hour
     * @param second the second of the minute
     */
    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour > 23)
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        if (minute < 0 || minute > 59)
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        if (second < 0 || second > 59)
            throw new IllegalArgumentException("Second must be between 0 and 59");

        this.timestamp = hour * 3600L + minute * 60L + second;
    }

    /**
     * @return the hour of the day
     */
    public int getHour() {
        return (int) (timestamp / 3600L);
    }

    /**
     * @param hour the hour of the day, between 0 and 23
     */
    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            throw new IllegalArgumentException("Hour must be between 0 and 23");

        this.timestamp = hour * 3600L + getMinute() * 60L + getSecond();
    }

    /**
     * @return the minute of the hour, between 0 and 59
     */
    public int getMinute() {
        return (int) ((timestamp % 3600L) / 60L);
    }

    /**
     * @param minute the minute of the hour, between 0 and 59
     */
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59)
            throw new IllegalArgumentException("Minute must be between 0 and 59");

        this.timestamp = getHour() * 3600L + minute * 60L + getSecond();
    }

    /**
     * @return the second of the minute, between 0 and 59
     */
    public int getSecond() {
        return (int) (timestamp % 60L);
    }

    /**
     * @param second the second of the minute, between 0 and 59
     */
    public void setSecond(int second) {
        if (second < 0 || second > 59)
            throw new IllegalArgumentException("Second must be between 0 and 59");

        this.timestamp = getHour() * 3600L + getMinute() * 60L + second;
    }

    /**
     * @return the timestamp of the time
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp of the time
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return true if the time is before noon, false otherwise
     */
    public boolean isAm() {
        return timestamp < (12 * 3600L);
    }

    /**
     * @param other the other time to compare to
     * @return the number of seconds between this time and the other time
     */
    public long cron(Time other) {
        return Math.abs(this.timestamp - other.timestamp);
    }

    /**
     * @param seconds the number of seconds to add to the time
     */
    public void addSeconds(int seconds) {
        long newTimestamp = this.timestamp + seconds;

        if (newTimestamp < 0)
            this.timestamp = (24 * 3600L) + newTimestamp;
        else if (newTimestamp > (24 * 3600L))
            this.timestamp = newTimestamp - (24 * 3600L);
        else
            this.timestamp = newTimestamp;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
}
