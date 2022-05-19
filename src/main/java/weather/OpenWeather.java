package weather;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class OpenWeather {
    // miasto, temperatura, zachmurzenie, wiatr, opis

    private String name;
    @SerializedName("main")
    private WeatherDetails weatherDetails;
    @SerializedName("wind")
    private WindDetails windDetails;


    @Override
    public String toString() {
        return "OpenWeather{" +
                "name='" + name + '\'' +
                ", weatherDetails=" + weatherDetails +
                ", windDetails=" + windDetails +
                '}';
    }
}

@AllArgsConstructor
@Getter
@Setter
@ToString
class WeatherDetails{
    private float temp;
    private float pressure;
    private int humidity;
}

@AllArgsConstructor
@Getter
@Setter
@ToString
class WindDetails{
    private float speed;
}
