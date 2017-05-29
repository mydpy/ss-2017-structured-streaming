// Databricks notebook source
/**
 * WARNING: This class for storing credentials is insecure
 *          and should be used for demonstration purposes only
 */
class AWSCredentials {
  private val _access = ""
  private val _secret = ""
  private var _endpoint = ""
  private var _region = ""

  def access = _access
  def secret = _secret
  def endpoint = _endpoint
  def region = _region
  
  def endpoint_(value: String): Unit = _endpoint = value
  def region_(value: String): Unit = _region = value
}