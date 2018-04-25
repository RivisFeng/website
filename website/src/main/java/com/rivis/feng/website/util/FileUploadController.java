package com.rivis.feng.website.util;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @author ltq 批量上传图片和附件
 */
@SuppressWarnings("restriction")
@Controller
@RequestMapping("upload/")
public class FileUploadController {
//	@SuppressWarnings("unused")
//	private static final Logger log = LoggerFactory.getLogger(FileUploadController.class);
//	private static long maxSize = 1000000;
//	private static HashMap<String, String> extMap = new HashMap<String, String>();
//	static {
//		extMap.put("image", "gif,jpg,jpeg,png,bmp");
//		extMap.put("flash", "swf,flv");
//		extMap.put("media", "swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb");
//		extMap.put("file", "doc,docx,xls,xlsx,ppt,pptx,pdf,htm,html,txt,zip,rar,gz,bz2");
//	}
//
//	/**
//	 * 上传图片公共方法
//	 *
//	 * @param request
//	 * @param response
//	 * @throws IOException
//	 * @throws InterruptedException
//	 */
//	@RequestMapping("uploadImage.do")
//	public void addImage(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, InterruptedException {
//		Map<String, String> data = new HashMap<String, String>();
//		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
//		MultipartFile uploadFile = multipartRequest.getFile("uploadFile");
//		if (uploadFile.getSize() > maxSize) {
//			data.put("code", JsonResult.FAIL);
//			data.put("message", "图片过大");
//			SpringUtils.renderJson(response, data);
//			return;
//		}
//
//		BaseConfig config = baseConfigService.selectByParam("cfg_ftp_data");
//
//		String type = request.getParameter("type");
//
//        String strType = getImageAddress(type);
//
//        String originalFilename = uploadFile.getOriginalFilename();
//
//		String filePath = "/" + strType + "/" + DateUtils.formatDate(new Date())+"/";
//
//		String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
//
//		String fileImageName = UUID.randomUUID().toString() + suffix;// 构建文件名称
//
//		FTPUtils ftp = new FTPUtils(config.getData(),config.getValue(),config.getValuese());
//
//		boolean ok = ftp.uploadFile(filePath, fileImageName, uploadFile.getInputStream());
//
//		String url = "";
//		if(ok){
//			url  =  config.getTitle()+ filePath + fileImageName;
//		}
//
//		data.put("code", JsonResult.SUCCESS);
//		data.put("message", "上传成功");
//		data.put("url", url);
//		data.put("fullPath", url);
//		SpringUtils.renderJson(response, data);
//
//
//		/*
//		String path = uploadFile.getOriginalFilename();
//		//获取保存到服务器的地址
//		String filePath = getFilePath(path,type);
//		File createFile = new File(filePath);
//		try {
//			uploadFile.transferTo(createFile);
//		} catch (IOException e) {
//			e.printStackTrace();
//			data.put("code", JsonResult.FAIL);
//			data.put("message", "图片上传出错");
//			SpringUtils.renderJson(response, data);
//			return;
//		}
//		//ImageUtils.Thumbnail(fileName, fileRealPathDir + File.separator + "mid_" + fileImageName, 320, 240, 100);
//		String picUrl = StringUtils.replace(StringUtils.substringAfter(filePath, Constants.IMAGE_FILE_PATH), "\\", "/");
//		String relativeUrl = "/static_img" +picUrl;
////		String relativeUrl = "/res/home" +picUrl;
//		String url = Constants.HTTPADDRESS+relativeUrl;
//		data.put("code", JsonResult.SUCCESS);
//		data.put("message", "上传成功");
//		data.put("url", relativeUrl);
//		data.put("fullPath", url);
//		SpringUtils.renderJson(response, data);
//		*/
//
//	}
//
//	/**
//	 * 图片分类地址
//	 *
//	 * @param type
//	 * @return
//	 */
//	public String getImageAddress(String type) {
//		String imageClassify = "";
//		switch (type) {
//		case "1": // 保存头像图片
//			imageClassify = "headImg";
//			break;
//		case "2":
//			imageClassify = "activityImage"; // 活动图片
//		case "3":
//			imageClassify = "banner"; // banner图片
//		default:
//			break;
//		}
//		return imageClassify;
//	}
//
//	/**
//	 * 获取保存到服务器的物理地址
//	 *
//	 * @param originalFilename
//	 * @return
//	 */
//	private String getFilePath(String originalFilename, String type) {
//		// 拼接具体存放的地址
//		String fileFolder = Constants.IMAGE_FILE_PATH + File.separator + getImageAddress(type) + File.separator
//				+ DateUtils.formatDate(new Date());
//
//		File file = new File(fileFolder);
//		if (!file.isDirectory()) {
//			file.mkdirs();
//		}
//		// 使用UUID生成文件名称
//		String fileName = UUID.randomUUID().toString() + "."+StringUtils.substringAfterLast(originalFilename, ".");
//		return fileFolder + File.separator + fileName;
//	}
//
//	@RequestMapping(value = "/editorImg")
//	public void attachUpload(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		String ret = "";
//		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
//		CommonsMultipartFile file = (CommonsMultipartFile) multipartRequest.getFile("filedata");
//		if (file.getSize() > maxSize) {
//			ret = "{\"err\":\"1\",\"msg\":\"上传文件大小超过限制\"}";
//			SpringUtils.renderJson(response, ret);
//			return;
//		}
//		String realFileName = file.getOriginalFilename();
//		/** 构建图片保存的目录 **/
//		String filePathDir = UploadUtils.getRelatedPath();
//		/** 得到图片保存目录的真实路径 **/
//		String fileRealPathDir = UploadUtils.getRealPath();
//
//		/** 获取文件的后缀 **/
//		String suffix = realFileName.substring(realFileName.lastIndexOf("."));
//		if (Arrays.<String> asList(extMap.get("image").split(","))
//				.contains(realFileName.substring(realFileName.lastIndexOf(".") + 1).toLowerCase())) {
//			// /**使用UUID生成文件名称**/
//			String fileImageName = UUID.randomUUID().toString() + suffix;// 构建文件名称
//			// String fileImageName = multipartFile.getOriginalFilename();
//			/** 拼成完整的文件保存路径加文件 **/
//			String fileName = fileRealPathDir + File.separator + fileImageName;
//
//			String resultFilePath = filePathDir + "/" + fileImageName;
//			File newFile = new File(fileName);
//			try {
//				FileCopyUtils.copy(file.getBytes(), newFile);
//			} catch (IllegalStateException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			ImageUtils.Thumbnail(fileName, fileRealPathDir + File.separator + "mid_" + fileImageName, 320, 240, 100);
//			if (StringUtils.isNotBlank(resultFilePath)) {
//				resultFilePath = resultFilePath.replaceAll("\\\\", "/");
//			}
//			String prefix = request.getContextPath();
//			String reqPath = prefix + resultFilePath;
//			// 返回路径给页面上传
//			ret = "{\"err\":\"\",\"msg\":\"" + reqPath + "\"}";
//		} else {
//			ret = "{\"err\":\"\",\"msg\":\"上传文件格式错误\"}";
//		}
//		SpringUtils.renderText(response, ret);
//
//	}
//
//	@RequestMapping(value = "/editorImgForKindEditor2")
//	public void editorImgForKindEditor2(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// 定义允许上传的文件扩展名
//		Map<String, Object> param = new HashMap<String, Object>();
//		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
//		CommonsMultipartFile file = (CommonsMultipartFile) multipartRequest.getFile("imgFile");
//		String realFileName = file.getOriginalFilename();
//		if (file.getSize() > maxSize) {
//			param.put("message", "上传文件大小超过限制");
//			param.put("error", 1);
//			SpringUtils.renderJson(response, param);
//			return;
//		}
//		/** 构建图片保存的目录 **/
//		String filePathDir = UploadUtils.getRelatedPath();
//		/** 得到图片保存目录的真实路径 **/
//		String fileRealPathDir = UploadUtils.getRealPath();
//
//		/** 获取文件的后缀 **/
//		String suffix = realFileName.substring(realFileName.lastIndexOf("."));
//		if (Arrays.<String> asList(extMap.get("image").split(","))
//				.contains(realFileName.substring(realFileName.lastIndexOf(".") + 1).toLowerCase())) {
//			// /**使用UUID生成文件名称**/
//			String fileImageName = UUID.randomUUID().toString() + suffix;// 构建文件名称
//			// String fileImageName = multipartFile.getOriginalFilename();
//			/** 拼成完整的文件保存路径加文件 **/
//			String fileName = fileRealPathDir + File.separator + fileImageName;
//
//			String resultFilePath = filePathDir + "/" + fileImageName;
//			File newFile = new File(fileName);
//			try {
//				FileCopyUtils.copy(file.getBytes(), newFile);
//			} catch (IllegalStateException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			ImageUtils.Thumbnail(fileName, fileRealPathDir + File.separator + "mid_" + fileImageName, 320, 240, 100);
//			if (StringUtils.isNotBlank(resultFilePath)) {
//				resultFilePath = resultFilePath.replaceAll("\\\\", "/");
//			}
//			String reqPath = resultFilePath;
//			// 返回路径给页面上传
//			param.put("url", request.getContextPath() + reqPath);
//			param.put("error", 0);
//		} else {
//			param.put("url", "");
//			param.put("message", "上传文件扩展名是不允许的扩展名");
//			param.put("error", 1);
//		}
//		// String ret = "{\"err\":0,\"url\":\""+reqPath+"\"}";
//		SpringUtils.renderJson(response, param);
//
//	}
//
//	@RequestMapping(value = "/editorImgForKindEditor")
//	public void editorImgForKindEditor(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// 定义允许上传的文件扩展名
//		Map<String, Object> param = new HashMap<String, Object>();
//		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
//		CommonsMultipartFile file = (CommonsMultipartFile) multipartRequest.getFile("imgFile");
//		String realFileName = file.getOriginalFilename();
//		if (file.getSize() > maxSize) {
//			param.put("message", "上传文件大小超过限制");
//			param.put("error", 1);
//			SpringUtils.renderJson(response, param);
//			return;
//		}
//		/** 构建图片保存的目录 **/
//		String filePathDir = UploadUtils.getRelatedPath();
//		/** 得到图片保存目录的真实路径 **/
//		String fileRealPathDir = UploadUtils.getRealPath();
//
//		/** 获取文件的后缀 **/
//		String suffix = realFileName.substring(realFileName.lastIndexOf("."));
//		if (Arrays.<String> asList(extMap.get("image").split(","))
//				.contains(realFileName.substring(realFileName.lastIndexOf(".") + 1).toLowerCase())) {
//			// /**使用UUID生成文件名称**/
//			String fileImageName = UUID.randomUUID().toString() + suffix;// 构建文件名称
//			// String fileImageName = multipartFile.getOriginalFilename();
//			/** 拼成完整的文件保存路径加文件 **/
//			String fileName = fileRealPathDir + File.separator + fileImageName;
//
//			String resultFilePath = filePathDir + "/" + fileImageName;
//			File newFile = new File(fileName);
//			try {
//				FileCopyUtils.copy(file.getBytes(), newFile);
//			} catch (IllegalStateException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			ImageUtils.Thumbnail(fileName, fileRealPathDir + File.separator + "mid_" + fileImageName, 320, 240, 100);
//			if (StringUtils.isNotBlank(resultFilePath)) {
//				resultFilePath = resultFilePath.replaceAll("\\\\", "/");
//			}
//			String reqPath = resultFilePath;
//			// 返回路径给页面上传
//			param.put("url", reqPath);
//			param.put("error", 0);
//		} else {
//			param.put("url", "");
//			param.put("message", "上传文件扩展名是不允许的扩展名");
//			param.put("error", 1);
//		}
//		// String ret = "{\"err\":0,\"url\":\""+reqPath+"\"}";
//		SpringUtils.renderJson(response, param);
//
//	}
//
//	/*
//	 * 多文件上传
//	 */
//	@RequestMapping(value = "/uploadFiles")
//	public void attachsUpload(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
//		List<MultipartFile> files = multipartRequest.getFiles("Filedata");
//
//		String reqPath = null;
//		String realFileName = null;
//		String suffix = null;
//		for (MultipartFile file : files) {
//			realFileName = file.getOriginalFilename();
//			System.out.println("文件名：" + realFileName);
//			/** 构建图片保存的目录 **/
//			String filePathDir = UploadUtils.getRelatedPath();
//			/** 得到图片保存目录的真实路径 **/
//			String fileRealPathDir = UploadUtils.getRealPath();
//			/** 获取文件的后缀 **/
//			suffix = realFileName.substring(realFileName.lastIndexOf("."));
//			// /**使用UUID生成文件名称**/
//			String fileImageName = UUID.randomUUID().toString() + suffix;// 构建文件名称
//			// String fileImageName = multipartFile.getOriginalFilename();
//			/** 拼成完整的文件保存路径加文件 **/
//			String fileName = fileRealPathDir + File.separator + fileImageName;
//			System.out.println("fileName" + fileName);
//			String resultFilePath = filePathDir + "/" + fileImageName;
//			System.out.println("resultFilePath" + resultFilePath);
//			File newFile = new File(fileName);
//			try {
//				FileCopyUtils.copy(file.getBytes(), newFile);
//			} catch (IllegalStateException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			if (StringUtils.isNotBlank(resultFilePath)) {
//				resultFilePath = resultFilePath.replaceAll("\\\\", "/");
//			}
//			reqPath = resultFilePath;
//			// 返回路径给页面上传
//
//		}
//		String flag = request.getParameter("flag");
//		// 返回路径给页面上传
//		String ret = "[{\"filepath\":\"" + reqPath + "\",\"filename\":\"" + realFileName + "\",\"suffix\":\"" + suffix
//				+ "\",\"flag\":\"" + flag + "\"}]";
//		System.out.println(ret);
//		SpringUtils.renderJson(response, ret);
//
//	}
//
//	/*
//	 * 上传身份证件
//	 */
//	@RequestMapping(value = "/uploadIdCard.do")
//	public String attachsUploadIdCard(HttpServletRequest request, HttpServletResponse response, Model model)
//			throws Exception {
//		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
//		List<MultipartFile> files = multipartRequest.getFiles("Filedata");
//
//		String reqPath = null;
//		String realFileName = null;
//		String suffix = null;
//		String returnImg = null;
//		int i = 0;
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		for (MultipartFile file : files) {
//			realFileName = file.getOriginalFilename();
//			System.out.println("文件名：" + realFileName);
//			/** 构建图片保存的目录 **/
//			String filePathDir = UploadUtils.getRelatedPath();
//			/** 得到图片保存目录的真实路径 **/
//			String fileRealPathDir = "/static" + File.separator + "tool" + File.separator + "files" + File.separator
//					+ "cradInfoImg" + File.separator + DateUtils.formatDate(new Date());
//			/** 获取文件的后缀 **/
//			suffix = realFileName.substring(realFileName.lastIndexOf("."));
//			// /**使用UUID生成文件名称**/
//			String fileImageName = UUID.randomUUID().toString() + suffix;// 构建文件名称
//			// String fileImageName = multipartFile.getOriginalFilename();
//			/** 拼成完整的文件保存路径加文件 **/
//			String fileName = fileRealPathDir + File.separator + fileImageName;
//			i++;
//
//			String resultFilePath = "/" + UploadUtils.FILE_PATH + "/" + "cradInfoImg" + "/"
//					+ DateUtils.formatDate(new Date()) + "/" + fileImageName;
//			returnImg = Constants.myimgUrl + "cradInfoImg" + "/" + DateUtils.formatDate(new Date()) + "/"
//					+ fileImageName; // 返回页面路径
//			map.put(i, resultFilePath);
//			File newFile = new File(fileName);
//			File newSS = new File(fileRealPathDir);
//			if (!newSS.exists()) {
//				newSS.mkdirs();
//			}
//			try {
//				FileCopyUtils.copy(file.getBytes(), newFile);
//			} catch (IllegalStateException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			if (StringUtils.isNotBlank(resultFilePath)) {
//				resultFilePath = resultFilePath.replaceAll("\\\\", "/");
//			}
//			reqPath = resultFilePath;
//			// 返回路径给页面上传
//
//		}
//		String flag = request.getParameter("flag");
//		// 返回路径给页面上传
//		String ret = "[{\"filepath\":\"" + reqPath + "\",\"filename\":\"" + realFileName + "\",\"suffix\":\"" + suffix
//				+ "\",\"flag\":\"" + flag + "\"}]";
//		System.out.println(ret);
//		System.out.println(map);
//		String option = request.getParameter("option");
//		DataUserImg dui = dataUserImgService.selectImgByUserId(this.loginFrontUser(request).getUserId());
//		if (dui == null) {
//			DataUserImg dus = new DataUserImg();
//			dus.setUserId(this.loginFrontUser(request).getUserId());
//			dus.setImg1(map.get(1)); // 身份证正面
//			dus.setImg2(map.get(2)); // 身份证反面
//			dus.setImg3(map.get(3)); // 银行卡正面
//			dus.setImg4(map.get(4)); // 本人持卡照片
//			dus.setImg5(map.get(5));// 换卡原因照片
//			dus.setCreateDate(DateUtils.formatDateToDate(DateUtils.dateTimePattern, new Date()));
//			dus.setIsPass(1);
//			dus.setIsUsed(1);
//			dus.setBelong(Integer.parseInt(option));
//			if (dataUserImgService.saveImg(dus)) {
//				BaseBankCard bankCard = this.baseBankCardService.getUserBank(this.userUpBankCard(request).getUserId());
//				bankCard.setBankName(this.userUpBankCard(request).getBankName());
//				bankCard.setBankAddress(this.userUpBankCard(request).getBankAddress());
//				bankCard.setBankAddress2(this.userUpBankCard(request).getBankAddress2());
//				bankCard.setProvince(this.userUpBankCard(request).getProvince());
//				bankCard.setCity(this.userUpBankCard(request).getCity());
//				bankCard.setBankCardNumber(this.userUpBankCard(request).getBankCardNumber());
//				bankCard.setIsPass(0);
//				bankCard.setCreateTime(new Date());
//				baseBankCardService.updateByUserId(bankCard);
//
//				request.getSession().removeAttribute(this.userUpBankCard(request).getUserId());
//				model.addAttribute("dus", dus);
//			}
//		} else {
//			dui.setUserId(this.loginFrontUser(request).getUserId());
//			dui.setImg1(map.get(1));
//			dui.setImg2(map.get(2));
//			dui.setImg3(map.get(3));
//			dui.setImg4(map.get(4));
//			dui.setImg5(map.get(5));
//			dui.setCreateDate(DateUtils.formatDateToDate(DateUtils.dateTimePattern, new Date()));
//			dui.setIsPass(1);
//			dui.setIsUsed(1);
//			dui.setBelong(Integer.parseInt(option));
//			if (dataUserImgService.updateImg(dui)) {
//				BaseBankCard bankCard = this.baseBankCardService.getUserBank(this.userUpBankCard(request).getUserId());
//				bankCard.setBankName(this.userUpBankCard(request).getBankName());
//				bankCard.setBankAddress(this.userUpBankCard(request).getBankAddress());
//				bankCard.setBankAddress2(this.userUpBankCard(request).getBankAddress2());
//				bankCard.setProvince(this.userUpBankCard(request).getProvince());
//				bankCard.setCity(this.userUpBankCard(request).getCity());
//				bankCard.setBankCardNumber(this.userUpBankCard(request).getBankCardNumber());
//				bankCard.setIsPass(0);
//				bankCard.setCreateTime(new Date());
//				baseBankCardService.updateByUserId(bankCard);
//
//				request.getSession().removeAttribute(this.userUpBankCard(request).getUserId());
//				model.addAttribute("dui", dui);
//			}
//		}
//		return "redirect:/userManage/getCardNo.do";
//	}
//
//	/*
//	 * 上传身份证件
//	 */
//	@RequestMapping(value = "/uploadHeadImg.do")
//	public void uploadHeadImg(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
//		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
//		List<MultipartFile> files = multipartRequest.getFiles("Filedata");
//
//		String reqPath = null;
//		String realFileName = null;
//		String suffix = null;
//		String returnImg = null;
//		int i = 0;
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		for (MultipartFile file : files) {
//			realFileName = file.getOriginalFilename();
//			System.out.println("文件名：" + realFileName);
//			/** 构建图片保存的目录 **/
//			String filePathDir = UploadUtils.FILE_PATH;// "static_img"
//			/** 得到图片保存目录的真实路径 **/
//			// String fileRealPathDir = "E:\\tool\\files";
//			// String fileRealPathDir = UploadUtils.getRealPath();
//			String fileRealPathDir = "/static" + File.separator + "tool" + File.separator + "files" + File.separator
//					+ "headImg" + File.separator + DateUtils.formatDate(new Date());
//			/** 获取文件的后缀 **/
//			suffix = realFileName.substring(realFileName.lastIndexOf("."));
//			// /**使用UUID生成文件名称**/
//			String fileImageName = UUID.randomUUID().toString() + suffix;// 构建文件名称//da5510bd-5448-4dd5-a2f8-276fffcd9abc.jpg
//			// String fileImageName = multipartFile.getOriginalFilename();
//			/** 拼成完整的文件保存路径加文件 **/
//			String fileName = fileRealPathDir + File.separator + fileImageName;// D:\tool\files\headImg\2016-10-17\da5510bd-5448-4dd5-a2f8-276fffcd9abc.jpg
//			i++;
//			String resultFilePath = "/" + filePathDir + "/" + "headImg" + "/" + DateUtils.formatDate(new Date()) + "/"
//					+ fileImageName;/// static_img/headImg/2016-10-17/da5510bd-5448-4dd5-a2f8-276fffcd9abc.jpg
//			// returnImg = Constants.imgUrl
//			// +"headImg"+"/"+DateUtils.formatDate(new
//			// Date())+"/"+fileImageName;
//			// //返回页面路径//http://192.168.1.114:8080/static_img/headImg/2016-10-17/da5510bd-5448-4dd5-a2f8-276fffcd9abc.jpg
//			returnImg = Constants.myimgUrl + "headImg" + "/" + DateUtils.formatDate(new Date()) + "/" + fileImageName;
//			System.out.println(returnImg);
//			map.put(i, resultFilePath);
//			File newFile = new File(fileName);
//			File newSS = new File(fileRealPathDir);// D:\tool\files\headImg\2016-10-17
//			if (!newSS.exists()) {
//				newSS.mkdirs();
//			}
//			try {
//				FileCopyUtils.copy(file.getBytes(), newFile);
//			} catch (IllegalStateException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			if (StringUtils.isNotBlank(resultFilePath)) {
//				resultFilePath = resultFilePath.replaceAll("\\\\", "/");
//			}
//			reqPath = resultFilePath;
//			// 返回路径给页面上传
//		}
//
//		AccountsUsers au = accountsUsersService.selectById(this.loginFrontUser(request).getUserId());
//		if (au != null) {
//			au.setHeadImg(map.get(1));
//			if (accountsUsersService.saveOrUpdate(au)) {
//				SpringUtils.renderJsonResult(response, JsonResult.SUCCESS, returnImg);
//			} else
//				SpringUtils.renderJsonResult(response, JsonResult.FAIL, "false");
//		}
//	}
//
//	/**
//	 * 删除物理文件 2013-12-12 cjx
//	 */
//	@RequestMapping(value = "/common/removeImg", method = RequestMethod.POST)
//	public void removeImg(HttpServletRequest request, HttpServletResponse response) {
//		String msg = "0";
//		try {
//			String imgUrlString = request.getParameter("imgUrl");
//			if (StringUtils.isNotBlank(imgUrlString)) {
//				String fileRealPathDir = request.getSession().getServletContext().getRealPath(imgUrlString);
//				File file = new File(fileRealPathDir);
//				if (file.exists()) {
//					file.delete();
//				}
//				msg = "1";
//			}
//		} catch (Exception e) {
//			System.out.println("删除文件出错====" + e.toString());
//		}
//		SpringUtils.renderJson(response, msg);
//	}

	/*
	 * 多文件上传
	 */
	/*
	 * @RequestMapping(value = "/uploadAppFlies") public void
	 * uploadAppFlies(HttpServletRequest request, HttpServletResponse response)
	 * throws Exception { MultipartHttpServletRequest multipartRequest =
	 * (MultipartHttpServletRequest) request; List<MultipartFile> files =
	 * multipartRequest.getFiles("Filedata");
	 * 
	 * String errMsg = ""; String errInfo = ""; String reqPath = ""; String
	 * tempPath = ""; String realFileName = ""; String suffix = ""; String
	 * version = ""; for (MultipartFile file : files) { realFileName =
	 * file.getOriginalFilename(); System.out.println("文件名：" + realFileName);
	 * String iosFile = PropertiesUtil.get("iosFile"); String androidFile =
	 * PropertiesUtil.get("androidFile"); String iosName =
	 * iosFile.substring(iosFile.lastIndexOf("/") + 1); String androidName =
	 * androidFile.substring(androidFile .lastIndexOf("/") + 1);
	 *//** 检查文件名 **/
	/*
	 * if (!iosName.equals(realFileName) && !androidName.equals(realFileName)) {
	 * errMsg = "文件名不正确，请核实后重新上传。"; break; }
	 *//** 获取文件的后缀 **/
	/*
	 * suffix = realFileName.substring(realFileName.lastIndexOf(".")); String
	 * filePath = ""; Map<String, Object> verMap = null; Map<String, String>
	 * param = new HashMap<String, String>();
	 *//** IOS版本更新暂不使用 **/
	/*
	 * 
	 * if(".ipa".equalsIgnoreCase(suffix)){ //ios filePath = iosFile; //获取版本信息
	 * verMap = AppUtils.analysiIpa(file.getInputStream());
	 * if(verMap.containsKey("error")){ errMsg = "文件解析出错，请核实后重新上传。"; errInfo =
	 * verMap.get("error").toString(); break; } version =
	 * verMap.get("CFBundleShortVersionString").toString(); param.put("type",
	 * AppVersion.APP_TYPE_IOS.toString()); }else
	 * 
	 * if (".apk".equalsIgnoreCase(suffix)) { // android filePath = androidFile;
	 * // 获取版本信息 CommonsMultipartFile cf = (CommonsMultipartFile) file;
	 * DiskFileItem fi = (DiskFileItem) cf.getFileItem(); verMap =
	 * AppUtils.analysiApk(fi.getStoreLocation()); if
	 * (verMap.containsKey("error")) { errMsg = "文件解析出错，请核实后重新上传。"; errInfo =
	 * verMap.get("error").toString(); break; } version =
	 * verMap.get("versionName").toString(); param.put("type",
	 * AppVersion.APP_TYPE_ANDROID.toString()); } else { errMsg =
	 * "文件类型出错，请核实后重新上传。"; break; }
	 *//** 比较版本 **/
	/*
	 * List<AppVersion> list = appVersionService.getAppVersion(param); if (list
	 * != null && list.size() > 0) { AppVersion appVer = list.get(0); String
	 * lastVersion = appVer.getVersion(); if (AppUtils.compare(version,
	 * lastVersion) != 1) { errMsg = "新上传版本要比当前版本高，当前版本：" + lastVersion +
	 * "。上传版本：" + version + "。"; break; } }
	 *//** 构建文件保存的目录 **/
	/*
	 * String filePathDir = PropertiesUtil.get("pathSuffix") + filePath;
	 *//** 得到文件保存目录的真实路径 **/
	/*
	 * String shareFile = PropertiesUtil.get("shareFile"); if
	 * (StringUtils.isBlank(shareFile)) { shareFile = UploadUtils.getRealPath();
	 * } String fileRealPathDir = shareFile + filePath;
	 *//** 拼成完整的文件保存路径加文件 **//*
							 * String fileName = fileRealPathDir + "_temp";//
							 * 保存至临时文件 File newFile = new File(fileName); try {
							 * FileCopyUtils.copy(file.getBytes(), newFile); }
							 * catch (IllegalStateException e) {
							 * e.printStackTrace(); } catch (IOException e) {
							 * e.printStackTrace(); } if
							 * (StringUtils.isNotBlank(filePathDir)) {
							 * filePathDir = filePathDir.replaceAll("\\\\", " /
							 * "); fileName = fileName.replaceAll("\\\\", "/");
							 * } reqPath = filePathDir; tempPath = fileName; //
							 * 返回路径给页面上传
							 * 
							 * } String flag = request.getParameter("flag"); //
							 * 返回路径给页面上传 String ret = "[{\"filepath\":\"" +
							 * reqPath + "\",\"filename\":\"" + realFileName +
							 * "\",\"suffix\":\"" + suffix + "\",\"version\":\""
							 * + version + "\",\"errmsg\":\"" + errMsg +
							 * "\",\"errinfo\":\"" + errInfo +
							 * "\",\"tempPath\":\"" + tempPath +
							 * "\",\"flag\":\"" + flag + "\"}]";
							 * System.out.println(ret);
							 * SpringUtils.renderJson(response, ret);
							 * 
							 * }
							 */
}
