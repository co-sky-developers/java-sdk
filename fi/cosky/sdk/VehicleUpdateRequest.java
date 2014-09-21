package fi.cosky.sdk;
import java.util.ArrayList;

/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */

public class VehicleUpdateRequest extends BaseData {
    private int Id;
    private String Name;
    private ArrayList<CapacityData> Capacities;
    private LocationData StartLocation;
    private LocationData EndLocation;
    private ArrayList<TimeWindowData> TimeWindows;
    private RouteData Route;
    private int VersionNumber;
    private String VehicleType;
    
    private double FixedCost;
    private double KilometerCost;
    private double HourCost;

    public RouteData getRoute() {
        return Route;
    }

    public void setRoute(RouteData route) {
        Route = route;
    }

    public VehicleUpdateRequest(String name, ArrayList<CapacityData> capacities, LocationData startLoc, LocationData endLoc){
        this.Capacities = capacities;
        this.EndLocation = endLoc;
        this.StartLocation = startLoc;
        this.Name = name;
    }

    public int getId() {
        return this.Id;
    }

    public void setCapacities(ArrayList<CapacityData> capa) {
        this.Capacities = capa;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setTimeWindows(ArrayList<TimeWindowData> timeWindows) {
        this.TimeWindows = timeWindows;
    }


    public LocationData getEndLocation() {
        return EndLocation;
    }

    public void setEndLocation(LocationData endLocation) {
        EndLocation = endLocation;
    }

    int getVersionNumber() {
		return VersionNumber;
	}

	void setVersionNumber(int versionNumber) {
		VersionNumber = versionNumber;
	}

	public String getName() {
		return Name;
	}

	public ArrayList<CapacityData> getCapacities() {
		return Capacities;
	}

	public ArrayList<TimeWindowData> getTimeWindows() {
		return TimeWindows;
	}

	@Override
    public String toString() {
        return "VehicleData{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Capacities=" + Capacities +
                ", StartLocation=" + StartLocation +
                ", EndLocation=" + EndLocation +
                ", TimeWindows=" + TimeWindows +
                ", Route=" + Route +
                '}' + super.toString();
    }

    public LocationData getStartLocation() {
        return StartLocation;
    }

    public void setStartLocation(LocationData startLocation) {
        StartLocation = startLocation;
    }

	public String getVehicleType() {
		return VehicleType;
	}

	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}

	public double getFixedCost() {
		return FixedCost;
	}

	public void setFixedCost(double fixedCost) {
		FixedCost = fixedCost;
	}

	public double getKilometerCost() {
		return KilometerCost;
	}

	public void setKilometerCost(double kilometerCost) {
		KilometerCost = kilometerCost;
	}

	public double getHourCost() {
		return HourCost;
	}

	public void setHourCost(double hourCost) {
		HourCost = hourCost;
	}
}
