package f.h.dragon.upload.controller;

import org.apache.log4j.Logger;

/**
 * DefaultUploadController: default upload implement
 * 
 * @author Wenlong Meng(wenlong.meng@gmail.com)
 * @version 1.0 at Mar 26, 2013
 * @since 1.0
 */
public class DefaultUploadController {

	//Local variables
	/**
	 * logger
	 */
	private static Logger logger = Logger
			.getLogger(DefaultUploadController.class);
	
	//Logic
	/**
	 * upload 
	 * 
	 * @return
	 */
	public String upload(){
		logger.debug("Begin: upload()...");
		String result = "";
		logger.debug("End: result = " + result);
		return result;
	}

}
