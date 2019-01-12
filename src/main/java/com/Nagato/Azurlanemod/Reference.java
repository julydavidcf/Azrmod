package com.Nagato.Azurlanemod;

public class Reference {

    public static final String MOD_ID = "AZR";

    public static final String CLIENT_PROXY_CLASS = "com.Nagato.Azurlanemod.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.Nagato.Azurlanemod.proxy.ServerProxy";

    public static enum Testitem {
        MAGICCUBE("Magiccube", "ItemMagiccube"),
        COIN("Coin","ItemCoin"),
        REDDIMOND("Reddimond","ItemReddimond"),
        EMBLEM("Emblem","itemEmblem");



        private String unlocalizedName;
        private String registryName;

        Testitem(String unlocalizedName, String  registryName){
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;

        }
        public String getUnlocalizedName(){
            return unlocalizedName;
        }

        public String getRegistryName(){
            return registryName;
        }

    }


    public static enum Testblocks {

        REDDIMONDBLOCK("Reddimondblock","BlockReddimondblock");


        private String unlocalizedName;
        private String registryName;

        Testblocks(String unlocalizedName, String  registryName){
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;

        }
        public String getUnlocalizedName(){
            return unlocalizedName;
        }

        public String getRegistryName(){
            return registryName;
        }

    }


}
