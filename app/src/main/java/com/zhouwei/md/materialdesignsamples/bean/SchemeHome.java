package com.zhouwei.md.materialdesignsamples.bean;

import java.util.List;

public class SchemeHome extends PageData{

    private List<SchemeItem> resultList;

    public static class SchemeItem{

        public static class Model{
            public static class ModelItem{
                private int schemeModelItemId;
                private int quantityStart;
                private int quantityEnd;
                private int scValue;

                public int getSchemeModelItemId() {
                    return schemeModelItemId;
                }

                public void setSchemeModelItemId(int schemeModelItemId) {
                    this.schemeModelItemId = schemeModelItemId;
                }

                public int getQuantityStart() {
                    return quantityStart;
                }

                public void setQuantityStart(int quantityStart) {
                    this.quantityStart = quantityStart;
                }

                public int getQuantityEnd() {
                    return quantityEnd;
                }

                public void setQuantityEnd(int quantityEnd) {
                    this.quantityEnd = quantityEnd;
                }

                public int getScValue() {
                    return scValue;
                }

                public void setScValue(int scValue) {
                    this.scValue = scValue;
                }
            }

            private int modelId;
            private String modelName;

            private List<ModelItem> modelItemList;

            public int getModelId() {
                return modelId;
            }

            public void setModelId(int modelId) {
                this.modelId = modelId;
            }

            public String getModelName() {
                return modelName;
            }

            public void setModelName(String modelName) {
                this.modelName = modelName;
            }

            public List<ModelItem> getModelItemList() {
                return modelItemList;
            }

            public void setModelItemList(List<ModelItem> modelItemList) {
                this.modelItemList = modelItemList;
            }
        }

        private int schemeId;
        private String schemeName;
        private String schemeStatus;
        private String createdTime;
        private String updatedTime;
        private String schemeStartDate;
        private String schemeEndDate;
        private List<Model> schemeModelDtoList;

        public int getSchemeId() {
            return schemeId;
        }

        public void setSchemeId(int schemeId) {
            this.schemeId = schemeId;
        }

        public String getSchemeStatus() {
            return schemeStatus;
        }

        public void setSchemeStatus(String schemeStatus) {
            this.schemeStatus = schemeStatus;
        }

        public String getSchemeStartDate() {
            return schemeStartDate;
        }

        public void setSchemeStartDate(String schemeStartDate) {
            this.schemeStartDate = schemeStartDate;
        }

        public String getSchemeEndDate() {
            return schemeEndDate;
        }

        public void setSchemeEndDate(String schemeEndDate) {
            this.schemeEndDate = schemeEndDate;
        }

        public String getSchemeName() {
            return schemeName;
        }

        public void setSchemeName(String schemeName) {
            this.schemeName = schemeName;
        }

        public String getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
        }

        public String getUpdatedTime() {
            return updatedTime;
        }

        public void setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
        }

        public List<Model> getSchemeModelDtoList() {
            return schemeModelDtoList;
        }

        public void setSchemeModelDtoList(List<Model> schemeModelDtoList) {
            this.schemeModelDtoList = schemeModelDtoList;
        }
    }

    public List<SchemeItem> getResultList() {
        return resultList;
    }

    public void setResultList(List<SchemeItem> resultList) {
        this.resultList = resultList;
    }
}
