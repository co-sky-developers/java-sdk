package fi.cosky.sdk;
/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */

import java.util.List;

public class PlanData extends BaseData {
	public static final String MimeType = "application/vnd.jyu.nfleet.plan";
	public static final double MimeVersion = 2.0;
	
	private int VersionNumber;
	private List<VehiclePlanData> Items;
	private KPIData KPIs;
	private List<TaskData> Unassigned;
    private List<DepotData> Depots;
	
	public int getVersionNumber() {
		return VersionNumber;
	}
	public void setVersionNumber(int versionNumber) {
		VersionNumber = versionNumber;
	}
	public List<VehiclePlanData> getItems() {
		return Items;
	}
	public void setItems(List<VehiclePlanData> items) {
		Items = items;
	}
	
	public KPIData getKPIs() {
		return KPIs;
	}
	public void setKPIs(KPIData kPIs) {
		KPIs = kPIs;
	}
	public List<TaskData> getUnassigned() {
		return Unassigned;
	}
	public void setUnassigned(List<TaskData> unassigned) {
		Unassigned = unassigned;
	}

    public List<DepotData> getDepots() {
        return Depots;
    }

    public void setDepots(List<DepotData> depots) {
        Depots = depots;
    }
}
