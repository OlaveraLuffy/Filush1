package codingwithmitch.com.googlemapsgoogleplaces;

public class UserInformation
{
    public String name;
    public  double latitude;
    public  double longitude;

    public UserInformation()
    {

    }
    public UserInformation(String comfort_room_name,double latitude,double longitude)
    {
        this.name=comfort_room_name;
        this.latitude=latitude;
        this.longitude=longitude;
    }
}
