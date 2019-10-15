package com.example.allocation.Release;

import java.util.List;
public class ReleasePojo {
        private long id;
        private String releaseId;
        private String orderId;
        private String shipFromLocationId;
        private String status;
        private List<ReleaseLine> releaseLine;

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getReleaseId() {
                return releaseId;
        }

        public void setReleaseId(String releaseId) {
                this.releaseId = releaseId;
        }

        public String getOrderId() {
                return orderId;
        }

        public void setOrderId(String orderId) {
                this.orderId = orderId;
        }

        public String getShipFromLocationId() {
                return shipFromLocationId;
        }

        public void setShipFromLocationId(String shipFromLocationId) {
                this.shipFromLocationId = shipFromLocationId;
        }

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public List<ReleaseLine> getReleaseLine() {
                return releaseLine;
        }

        public void setReleaseLine(List<ReleaseLine> releaseLine) {
                this.releaseLine = releaseLine;
        }
}
