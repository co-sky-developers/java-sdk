package fi.cosky.sdk;

/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */

public class UserData extends BaseData {
    private int Id;
    private int ClientId;
    private int VersionNumber;
    private int OptimizationCount;
    
    public int getId() {
        return Id;
    }
    
    public void setId(int id) {
        Id = id;
    }

	public int getClientId() {
		return ClientId;
	}

	public void setClientId(int clientId) {
		ClientId = clientId;
	}

	public int getVersionNumber() {
		return VersionNumber;
	}

	public void setVersionNumber(int versionNumber) {
		VersionNumber = versionNumber;
	}

	public int getOptimizationCount() {
		return OptimizationCount;
	}

	public void setOptimizationCount(int optimizationCount) {
		OptimizationCount = optimizationCount;
	}
}
