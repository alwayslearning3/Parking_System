package Models;

public class Client extends User {
    private long idDocument;
    private long telephone;

    private boolean inNewUser = false;

    public Client() {
    }

    public Client(String name, String lastName, long idDocument, long telephone) {
        super(name, lastName);
        this.idDocument = idDocument;
        this.telephone = telephone;
        inNewUser = true;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public long getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(long idDocument) {
        this.idDocument = idDocument;
    }

    public boolean isInNewUser() {
        return inNewUser;
    }

    public void setInNewUser(boolean inNewUser) {
        this.inNewUser = inNewUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente {");
        sb.append("nombre: ").append(getName());
        sb.append(", apellido: ").append(getLastName());
        sb.append(", documento: ").append(getIdDocument());
        sb.append(", telefono: ").append(getTelephone());
        sb.append('}');
        return sb.toString();
    }
}
