package model.thirdparty.openweather

data class OpenWeatherZipCodeResponse (
    val name: String,
    val weather: List<Weather>,
    val main: WeatherMain
)