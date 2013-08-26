package org.encore.server;

import org.encore.entityframework.manager.MachineManager;
import org.encore.entityframework.manager.NetworkManager;


/***
 * 
 * @author bmagee
 * Server program allows Jeu clients to connect and play in the same instance
 * of a game. 
 * 
 * Currently the server is limited to exchanging messages. However, support
 * for multiple players in the same 'world' should be added soon...
 * 
 * Rewritten from scratch, after the previous abomination didn't work. 
 *
 */

public class Server {

	public static void main(String args[])
	{
		MachineManager mm = MachineManager.getinstance();
		NetworkManager nm = NetworkManager.getinstance();
		nm.listen(8080);
		
		//TODO: redo and copy server machines and components
//		mm.add(new MovementMachine());
//		
//		for(;;){
//			mm.update(1f);
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}
