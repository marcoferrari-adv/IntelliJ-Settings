#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

import wt.method.RemoteAccess;
import wt.method.RemoteMethodServer;
import wt.session.SessionHelper;

public class ${NAME} implements RemoteAccess {

    public static void main(String[] args) {
        try {
            RemoteMethodServer rms = RemoteMethodServer.getDefault();
			SessionHelper.manager.getPrincipal();
			rms.invoke("execute", ${NAME}.class.getName(), null, new Class[]{}, new Object[]{});
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void execute() {
    
    }
}
