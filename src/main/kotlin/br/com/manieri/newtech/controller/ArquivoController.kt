package br.com.manieri.newtech.controller

import br.com.manieri.newtech.dto.upload.ResultSaveFile
import org.springframework.core.io.ByteArrayResource
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import org.springframework.core.io.Resource
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import java.nio.file.Files
import java.nio.file.Paths

@RestController
@RequestMapping("/upload")
class ArquivoController {

    @PostMapping("/norma")

    fun uploadArquivo(file: MultipartFile) : ResultSaveFile {
        val uploadsDir = "C:/Users/jvman/Documents/GitProjects/Projeto-Sequoia/uploads/"

        if (!Files.exists(Paths.get(uploadsDir))) {
            Files.createDirectories(Paths.get(uploadsDir))
        }

        val filePath = Paths.get("$uploadsDir/${file.originalFilename}")
        Files.copy(file.inputStream, filePath)

        return ResultSaveFile(file.originalFilename!!, filePath.toString())
    }

    @GetMapping("/download/{fileName:.+}")
    fun downloadArquivo(@PathVariable fileName: String): ResponseEntity<Resource> {
        val uploadsDir = "C:/Users/jvman/Documents/GitProjects/Projeto-Sequoia/uploads/"
        val filePath = Paths.get("$uploadsDir/$fileName")
        val resource: Resource = ByteArrayResource(Files.readAllBytes(filePath))

        return ResponseEntity.ok()
            .contentType(MediaType.APPLICATION_PDF)
            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"$fileName\"")
            .body(resource)
    }
}