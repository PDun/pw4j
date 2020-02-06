package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.pw4j.domains.subdomains.AllianceMembersContainer;

import java.util.List;
import java.util.Objects;

public class AllianceMembers extends Entity {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("nations")
    @Expose
    private List<AllianceMembersContainer> nations = null;

    public Boolean getSuccess() {
        return success;
    }

    public List<AllianceMembersContainer> getNations() {
        return nations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllianceMembers that = (AllianceMembers) o;
        return Objects.equals(success, that.success) &&
                Objects.equals(nations, that.nations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, nations);
    }

    @Override
    public String toString() {
        return "AllianceMembers{" +
                "success=" + success +
                ", nations=" + nations +
                '}';
    }
}
