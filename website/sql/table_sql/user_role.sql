/*
 Navicat MySQL Data Transfer

 Source Server         : sureface
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : officialwebsite

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 03/06/2018 21:11:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `user_role_id` bigint(18) NOT NULL COMMENT '用户角色ID',
  `user_id` bigint(18) NOT NULL COMMENT '用户ID',
  `role_id` bigint(18) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`user_role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '用户角色' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (452851513149095936, 450395793623351296, 452850993458053120);
INSERT INTO `user_role` VALUES (452851579754643456, 450395793623351296, 452851288007245824);

SET FOREIGN_KEY_CHECKS = 1;
