

    public class Contact {
        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber){
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public void setContactName(String name){
            this.name = name;
        }

        public String getContactName(){
            return name;
        }

        public void setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber(){
            return phoneNumber;
        }

        @Override
        public String toString(){
            return String.format("""
                =========================
                Contact Name: %s
                PhoneNumber: %s
                =========================
                """, name,phoneNumber);
        }

    }
